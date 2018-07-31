import java.io.File;
import java.util.Scanner;

public class optiuni extends Thread{
	
	Scanner input=new Scanner(System.in);
	public int alegereOptiuni;
	public String filePath;
	
	fileReader reader=new fileReader();
	
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
    		if(deleteFile.exists()) {
    			deleteFile.delete();
    			System.out.println("Fisier sters cu suucces!");
    		}
    		else {
    			System.out.println("Fisierul nu a putut fi gasit!");
    		}
    		enter();
    		run();
    	}catch(Exception e) {
    		System.out.println("A aparut o eroare neprevazuta la stergerea fisierelor!");
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
	    else if(alegereOptiuni==4){
	    	System.out.println("Programul a fost inchis!");
	    	System.exit(0);
	    }
	}
}
