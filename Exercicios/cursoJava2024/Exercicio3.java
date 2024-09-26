package cursoJava2024; 
import java.util.Scanner;

public class Exercicio3 {


	    public static void main(String[] args) {
	        // Criar um scanner para capturar a entrada do usuário
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar ao usuário que insira uma palavra
	        System.out.print("Digite uma palavra: ");
	        String palavra = scanner.nextLine();

	        // Remover espaços e converter para minúsculas (caso haja frases ou maiúsculas)
	        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();

	        // Inverter a palavra
	        String palavraInvertida = new StringBuilder(palavraFormatada).reverse().toString();

	        // Verificar se a palavra original formatada é igual à palavra invertida
	        if (palavraFormatada.equals(palavraInvertida)) {
	            System.out.println(palavra + " é um palíndromo.");
	        } else {
	            System.out.println(palavra + " não é um palíndromo.");
	        }

	        // Fechar o scanner
	        scanner.close();
	    }
}
	
