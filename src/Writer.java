import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Writer {
	
	Scanner input = new Scanner(System.in);
	String text="";
	
	public void writeFile(String path) {
		try {
			PrintStream consoleOutput = System.out; //afisarea la consola
			PrintStream fileOutput=new PrintStream(new File(path));	 //afisarea in fisier
			System.out.println("Acum alege fontul, tipul acestuia, marimea si culoarea");
			chooseFont font = new chooseFont();
			font.alegereFont();
			font.alegereTipFont();
			font.alegereMarimeFont();
			font.alegereCuloareText();
			System.setOut(fileOutput); //setam afisarea in fisier
			font.afisareAlegeri();
			System.setOut(consoleOutput); //setam afisarea in consola
			System.out.println("Acum poti scrie textul!\n\n\n");
			do {
				System.setOut(fileOutput); //settam afisarea in fisier
				text=input.nextLine();
				if(text.equals("#schimba font")) {
					System.setOut(consoleOutput);
					font.alegereFont();
					System.setOut(fileOutput);
					font.afisareAlegeri();
				}
				if(text.equals("#schimba tip font")) {
					System.setOut(consoleOutput);
					font.alegereTipFont();
					System.setOut(fileOutput);
					font.afisareAlegeri();
				}
				if(text.equals("#schimba marime font")) {
					System.setOut(consoleOutput);
					font.alegereMarimeFont();
					System.setOut(fileOutput);
					font.afisareAlegeri();
				}
				if(text.equals("#schimba culoare text")) {
					System.setOut(consoleOutput);
					font.alegereCuloareText();
					System.setOut(fileOutput);
					font.afisareAlegeri();
				}
				if(text.equals("#schimba tot fontul")) {
					System.setOut(consoleOutput);
					font.alegereFont();
					font.alegereTipFont();
					font.alegereMarimeFont();
					font.alegereCuloareText();
					System.setOut(fileOutput);
					font.afisareAlegeri();
				}
				if(! text.equals("#save") && !text.equals("#schimba font") && !text.equals("#schimba tip font") && !text.equals("#schimba marime font") && !text.equals("#schimba culoare text") && !text.equals("#schimba tot fontul") ) fileOutput.println(text);
			}while(! text.equals("#save"));
			System.setOut(consoleOutput); //setam afisarea in consola
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
