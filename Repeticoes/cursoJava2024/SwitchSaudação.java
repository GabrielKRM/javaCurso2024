package cursoJava2024;

import java.util.Scanner;

public class SwitchSaudação {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("que horas são?");
		int horas = scanner.nextInt();

		switch (horas) {
		case 5, 6, 7, 8, 9, 10, 11:
			System.out.println("bom dia, peguiça");
			break;
		case 12, 13, 14, 15, 16, 17:
			System.out.println("boa tarde, vagabundo");
			break;
		case 18, 19, 20, 21, 22, 23:
			System.out.println("boa noite, seu leigo");
			break;
		case 00, 01, 02, 03, 04:
			System.out.println("boa madrugada, mas vai dormir fdp!!!!");
			break;
			
		default:
			System.out.println("HORARIO invalido");
			
		}

	}

}
