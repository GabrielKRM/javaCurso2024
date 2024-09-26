package cursoJava2024;


	import java.util.Scanner;

	public class InversaoDeString {
	    public static void main(String[] args) {
	        // Criar um scanner para capturar a entrada do usuário
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar ao usuário que insira uma palavra
	        System.out.print("Digite uma palavra: ");
	        String palavra = scanner.nextLine();

	        // Inverter a palavra usando um StringBuilder
	        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

	        // Exibir a palavra invertida
	        System.out.println("Palavra invertida: " + palavraInvertida);

	        // Fechar o scanner
	        scanner.close();
	    }
	}

	

