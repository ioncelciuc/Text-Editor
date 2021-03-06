import java.util.Scanner;

public class chooseFont implements font {
	
	Scanner input = new Scanner(System.in);
	public int alegere;
	public String font = "New Times Roman";
	public String tipFont = "Normal";
	public int marimeFont = 16;
	public String culoareText = "Negru";
	
	public void alegereFont() {
		alegere=0;
		if(alegere<1 || alegere>5) {
			System.out.println("Ce fel de font vreti sa folositi?");
			System.out.println("1. New Times Roman");
			System.out.println("2. Arial");
			System.out.println("3. Calibri");
			System.out.println("4. Helvetica");
			System.out.println("5. Lucida Console");
			alegere=input.nextInt();
			switch(alegere) {
				case 1:
					font = "New Times Roman";
					break;
				case 2:
					font = "Arial";
					break;
				case 3:
					font = "Calibri";
					break;
				case 4:
					font = "Helvetica";
					break;
				case 5:
					font = "Lucida Console";
					break;
				default:
					System.out.println("Eroare! Instroduceti un numar de la 1 la 5, reprezentand fontul pe care doriti sa il alegeti!");
					alegereFont();;
					break;
			}
		}
	}
	
	public void alegereTipFont() {
		alegere=0;
		if(alegere<1 || alegere>3) {
			System.out.println("Ce tip de font doriti sa folositi?");
			System.out.println("1. Normal");
			System.out.println("2. Bold");
			System.out.println("3. Italic");
			alegere=input.nextInt();
			switch(alegere) {
				case 1:
					tipFont="Normal";
					break;
				case 2:
					tipFont="Bold";
					break;
				case 3:
					tipFont="Italic";
					break;
				default:
					System.out.println("Eroare! Introduceti un numar de la 1 la 3 reprezentand tipul de font ales!");
					alegereTipFont();
					break;
			}
		}
	}
	
	public void alegereMarimeFont() {
		alegere=0;
		if(alegere<1) {
			System.out.println("Introduceti marimea fontului: ");
			alegere=input.nextInt();
			if(alegere<1) {
				System.out.println("Eroare! Marimea fontului trebuie sa fie mai mare sau egala cu 1");
				alegereMarimeFont();
			}
		}
		marimeFont=alegere;
	}
	
	public void alegereCuloareText() {
		alegere=0;
		if(alegere<1 || alegere>9) {
			System.out.println("Alege culoarea textului!");
			System.out.println("1. Negru");
			System.out.println("2. Gri");
			System.out.println("3. Violet");
			System.out.println("4. Albastru");
			System.out.println("5. Verde");
			System.out.println("6. Galben");
			System.out.println("7. Portocaliu");
			System.out.println("8. Rosu");
			System.out.println("9. Alb");
			alegere=input.nextInt();
			switch(alegere) {
				case 1:
					culoareText="Negru";
					break;
				case 2:
					culoareText="Gri";
					break;
				case 3:
					culoareText="Violet";
					break;
				case 4:
					culoareText="Albastru";
					break;
				case 5:
					culoareText="Verde";
					break;
				case 6:
					culoareText="Galben";
					break;
				case 7:
					culoareText="Portocaliu";
					break;
				case 8:
					culoareText="Rosu";
					break;
				case 9:
					culoareText="Alb";
					break;
				default:
					System.out.println("Eroare! Alege un numar de la 1 la 9 reprezentand una din culorile disponibile!");
					alegereCuloareText();
					break;
			}
		}
	}
	
	public void afisareAlegeri() {
		System.out.println("## " + "Font: " + font + " ; Tip font: " + tipFont + " ; Marime font: " + marimeFont + " ; Culoare text: " + culoareText + " ##");
	}
	
}
