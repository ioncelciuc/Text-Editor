import java.io.File;
import java.util.Scanner;

public class optiuni extends Thread{
	
	Scanner input=new Scanner(System.in);
	public int alegereOptiuni;
	public String filePath;
	
	fileReader reader=new fileReader();
	Writer writer=new Writer();
	
	public void enter() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public void goToMenu() {
		enter();
		System.out.println("Tasteaza \\ urmat de enter pentru a reveni la meniul principal");
		String detectBackslash=input.next();
		if(detectBackslash.equals("\\")) {
			enter();
			run();
		}
		else {
			enter();
			goToMenu();
		}
	}
	
	public void deleteFiles() {
		enter();
		reader.fileRead("instructiuni_stergere_fisier");
		enter();
		filePath=input.next();
    	try {
    		File deleteFile=new File(filePath);
    		
    		if(deleteFile.delete()) {
    			System.out.println("Fisier sters cu succes!");
    		}
    		else {
    			System.out.println("Fisierul nu a putut fi sters!");
    		}
    		enter();
    		run();
    	}catch(Exception e) {
    		System.out.println(e);
    		enter();
    	}
	}
	
	public void run() {
		
	    reader.fileRead("menu");
	    alegereOptiuni=input.nextInt();
	    if(alegereOptiuni==1) {
	    	enter();
	    	reader.fileRead("instructiuni");
	    	goToMenu();
	    }
	    else if(alegereOptiuni==2){
	    	enter();
	    	reader.fileRead("instructiuni_deschidere_fisier");
	    	enter();
	    	filePath=input.next();
	    	enter();
	    	reader.fileRead(filePath);
	    	goToMenu();
	    }
	    else if(alegereOptiuni==3) {
	    	deleteFiles();
	    }
	    else if(alegereOptiuni==4) {
	    	comenziBazaWriter();
	    	enter();
	    	reader.fileRead("instructiuni_creare_fisier_nou");
	    	enter();
	    	filePath=input.next();
	    	writer.writeFile(filePath);
	    	goToMenu();
	    }
	    else if(alegereOptiuni==5){
	    	System.out.println("Programul a fost inchis!");
	    	System.exit(0);
	    }
	}
	
	public void comenziBazaWriter() {
		
    		System.out.println("Ai vrea sa aflii comenzile de baza ale editorului?");
    		System.out.println("1. Da");
    		System.out.println("2. Nu, ma descurc si singur");
    		alegereOptiuni=input.nextInt();
    		if(alegereOptiuni==1) {
    			reader.fileRead("comenzi_baza_writer");
    		}
    		else if(alegereOptiuni!=1 && alegereOptiuni!=2) {
    			System.out.println("Raspunsul nu a putut fi recunoscut!");
    			comenziBazaWriter();
    		}
    	}
}
