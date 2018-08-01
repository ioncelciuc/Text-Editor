import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Writer {
	
	Scanner input = new Scanner(System.in);
	String text="";
	
	public void writeFile(String path) {
		try {
			PrintStream consoleOutput = System.out;
			PrintStream fileOutput=new PrintStream(new File(path));	
			System.out.println("Acum alege fontul, tipul acestuia, marimea si culoarea");
			chooseFont font = new chooseFont();
			font.alegereFont();
			font.alegereTipFont();
			font.alegereMarimeFont();
			font.alegereCuloareText();
			System.setOut(fileOutput);
			font.afisareAlegeri();
			System.setOut(consoleOutput);
			System.out.println("Acum poti scrie textul!\n\n\n");
			do {
				System.setOut(fileOutput);
				text=input.nextLine();
				if(! text.equals("#save")) fileOutput.println(text);
			}while(! text.equals("#save"));
			System.setOut(consoleOutput);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
