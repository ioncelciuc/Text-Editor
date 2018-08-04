import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Writer {
	
	Scanner input = new Scanner(System.in);
	String text="";
	
	public void writeFile(String path) {
		try {
			PrintStream consoleOutput = System.out; //afisarea la consola
			File fisierAles = new File(path);
			if(fisierAles.exists() && !fisierAles.isDirectory()) {
					System.out.println("Fisierul exista deja!");
					File copycat=new File(path + ".txt");//cream un fisier copie
					PrintStream copycatOutput=new PrintStream(new File(copycat.getPath()));//afisarea in fisierul copie
					fileReader reader = new fileReader();
					System.setOut(copycatOutput);
					reader.fileRead(fisierAles.getPath());
					System.setOut(consoleOutput);
					System.out.println("Acum poti scrie textul in continuare!");
					System.out.println();
					System.out.println();
					System.out.println();
					chooseFont font = new chooseFont();
					do {
						System.setOut(copycatOutput); //settam afisarea in fisier
						text=input.nextLine();
						if(text.equals("#schimba font")) {
							System.setOut(consoleOutput);
							font.alegereFont();
							System.setOut(copycatOutput);
							font.afisareAlegeri();
						}
						if(text.equals("#schimba tip font")) {
							System.setOut(consoleOutput);
							font.alegereTipFont();
							System.setOut(copycatOutput);
							font.afisareAlegeri();
						}
						if(text.equals("#schimba marime font")) {
							System.setOut(consoleOutput);
							font.alegereMarimeFont();
							System.setOut(copycatOutput);
							font.afisareAlegeri();
						}
						if(text.equals("#schimba culoare text")) {
							System.setOut(consoleOutput);
							font.alegereCuloareText();
							System.setOut(copycatOutput);
							font.afisareAlegeri();
						}
						if(text.equals("#schimba tot fontul")) {
							System.setOut(consoleOutput);
							font.alegereFont();
							font.alegereTipFont();
							font.alegereMarimeFont();
							font.alegereCuloareText();
							System.setOut(copycatOutput);
							font.afisareAlegeri();
						}
						if(! text.equals("#save") && !text.equals("#schimba font") && !text.equals("#schimba tip font") && !text.equals("#schimba marime font") && !text.equals("#schimba culoare text") && !text.equals("#schimba tot fontul") ) copycatOutput.println(text);
					}while(! text.equals("#save"));
					System.setOut(consoleOutput);
					copycatOutput.close();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("Fisierul a fost salvat!");
					PrintStream fileOutput=new PrintStream(new File(path));
					System.setOut(fileOutput);
					reader.fileRead(copycat.getPath());
					System.setOut(consoleOutput);
					fileOutput.close();
					copycat.delete();
					
			} else {
				PrintStream fileOutput=new PrintStream(new File(path));	 //afisarea in fisier
				chooseFont font = new chooseFont();
				System.out.println("Acum alege fontul, tipul acestuia, marimea si culoarea");
				
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
				fileOutput.close();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Fisierul a fost salvat!");
			}
		}catch(Exception e) {
				System.out.println(e);
		}
	}
	
	
}
