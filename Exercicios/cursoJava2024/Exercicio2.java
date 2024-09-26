package cursoJava2024; 
	
	import java.util.Scanner;
	
	
	public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		if (idade > 18 ) {
		System.out.println(" Voce é maior de idade!");
		}else {
		System.out.println("Voce nao é maior de idade"); 

		}
	}
	}
