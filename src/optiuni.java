import java.util.Scanner;

public class optiuni extends mainClass{
	
	Scanner input=new Scanner(System.in);
	public int alegereOptiuni;
	public String filePath;
	
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
	
	public void runApp() {
		fileReader reader=new fileReader();
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
	}
}
