import java.util.Scanner;

public class instructiuni {
	public void afisareInstructiuni(){
		System.out.println("Ai vrea sa fie afisate instructiunile?");
		System.out.println("1. Da");
		System.out.println("2. Nu");
		Scanner input = new Scanner(System.in);
		int alegere=input.nextInt();
		input.close();
		switch(alegere) 
		{
			case 1:
				System.out.println("instructiuni");
			case 2:
				System.out.println();
				break;
			default:
				System.out.println("Eroare! Introduceti una din cifrele 1 sau 2, pentru a alege Da, respectiv Nu");
				
		}
	}
}
