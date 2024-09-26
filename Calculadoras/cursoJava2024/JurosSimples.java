package cursoJava2024;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
		  //instanciando a classe(usando-a)
		  
		  //entrada de valores:
		  System.out.println("-----------------------------");
		  System.out.println("---Calculadora de Juros Simples");
		  System.out.println("-----------------------------");
		  System.out.println("digite o capital:");
		  double capital = scanner.nextDouble();
		  
		  System.out.println("informe a taxa de juros(%): ");
		  double taxa = scanner.nextDouble();
		  
		  System.out.println("informe o tempo(em anos): ");
		  int tempo = scanner.nextInt();
		  
		  //calculando os juros:
		  double juros = ( capital * taxa * tempo )/100;
		  System.out.println("o valor dos juros são: "+juros);
		  
		 
		  double total = capital + juros;
		  System.out.println("o total investido + juros é de: "+total);
		  
		  scanner.close();

	}

}
