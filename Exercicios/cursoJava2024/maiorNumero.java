package cursoJava2024;

import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("digite seu primeiro numero:");
		int numero1 = scanner.nextInt();
		
		System.out.println("digite seu segundo numero:");
		int numero2 = scanner.nextInt();
		
		int maior = ( numero1 > numero2 ) ? numero1 : numero2;
		System.out.println("o maior numero é "+maior);
		scanner.close();
		 

	}

}
