import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Writer {
	
	Scanner input = new Scanner(System.in);
	String text="";
	
	public void writeFile(String path) {
		try {
			PrintStream consoleOutput = System.out;
			PrintStream myconsole=new PrintStream(new File(path));	
			System.out.println("Acum poti scrie textul!\n\n\n");
			do {
				System.setOut(myconsole);
				text=input.nextLine();
				if(! text.equals("#save")) myconsole.println(text);
			}while(! text.equals("#save"));
			System.setOut(consoleOutput);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
