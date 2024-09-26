package cursoJava2024;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite uma palavra: ");
		String frase = scanner.nextLine();
		
		frase = frase.toLowerCase();
		
		
		int contadorVogais = 0;
		
		String vogais = "aeiou";
		
		
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
		
			if (vogais.indexOf(c) != -1) {
				contadorVogais++;
			}
		}	
		
				
				System.out.println("a frase contém " + contadorVogais + " vogais");
				
				scanner.close();
			
		
			
		
		
	

	}

}
