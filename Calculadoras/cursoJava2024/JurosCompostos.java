package cursoJava2024;

import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		
		
		//Instanciando uma classe para usa-la:
		Scanner scanner = new Scanner(System.in);
		
		
		//entradas do usuario:
		System.out.println("informe seu capital: ");
		double capital = scanner.nextDouble();
		
		
		System.out.println("qual é a taxa de juros: ");
		double taxa = scanner.nextDouble();
		
		
		System.out.println("digite o tempo em anos: ");
		int tempo = scanner.nextInt();
		
		//Calculando os juros compostos:
		double montante = capital * Math.pow(1 + (taxa/100), tempo);
		
		System.out.println("o montante final sera de R$ "+ montante);
		scanner.close();
		
		

	}

}
