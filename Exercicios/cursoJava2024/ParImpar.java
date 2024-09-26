package cursoJava2024;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int valor = scanner.nextInt();
		if (valor % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("o numero é impar");
		}
	} 

}
