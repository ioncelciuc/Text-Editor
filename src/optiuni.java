import java.io.File;
import java.util.Scanner;

public class optiuni extends mainClass{
	
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
		filePath=input.next();
		if(filePath.equals("\\")) {
			enter();
			runApp();
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
    		runApp();
    	}catch(Exception e) {
    		System.out.println("A aparut o eroare neprevazuta la stergerea fisierelor!");
    		enter();
    	}
	}
	
	public void runApp() {
		
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
	}
}
