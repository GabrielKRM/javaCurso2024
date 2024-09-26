package cursoJava2024;

import java.util.Scanner;

public class Taxista {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o número de quilometros rodados: ");
		double quilometrosRodados = scanner.nextDouble();
	
		double taxafixa = 10.0;
		double precoporkm = 2.0;
		
		double valortotal = taxafixa + (quilometrosRodados * precoporkm);
		
		
		System.out.printf("O valor total a ser pago pelo táxi é: R$ %.2f%n", valortotal);
		
		
		scanner.close();
		
		
		
	}

}
