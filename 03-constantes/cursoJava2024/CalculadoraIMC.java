package cursoJava2024;
	
	import java.util.Scanner;

	public class CalculadoraIMC {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite seu peso em kg: ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite sua altura em metros: ");
	        double altura = scanner.nextDouble();

	        double imc = peso / (altura * altura);

	        System.out.println("Seu IMC é: " + imc);

	        // Classificação do IMC (adapte conforme necessário)
	        if (imc < 18.5) {
	            System.out.println("Abaixo do peso.");
	        } else if (imc < 25) {
	            System.out.println("Peso normal.");
	        } else if (imc < 30) {
	            System.out.println("Sobrepeso.");
	        } else {
	            System.out.println("Obesidade.");
	        }

	        scanner.close();
	    }
	}

