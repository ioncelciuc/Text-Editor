import java.util.Scanner;

public class optiuni extends mainClass{
	
	Scanner input=new Scanner(System.in);
	public int alegereOptiuni;
	
	public void runApp() {
		fileReader reader=new fileReader();
	    reader.fileRead("menu");
	    alegereOptiuni=input.nextInt();
	    if(alegereOptiuni==1) {
	    	reader.fileRead("instructiuni");
	    	runApp();
	    }
	    else if(alegereOptiuni==2){
	    	
	    }
	}
}
