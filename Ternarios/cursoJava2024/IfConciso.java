package cursoJava2024;

public class IfConciso {

	public static void main(String[] args) {
		
		//Declarando variavel:
		int numero = 100;
		
		//uso do if normal:
		 /*if ( numero >= 10) {
			System.out.println("Valor maior que 10");
		} else {
			System.out.println("valor menor que 10");
		}*/
		String resultado = ( numero >= 10) ? "Maior que 10":"Menor que 10";
		System.out.println("o numero "+numero+ " é "+resultado);

	}

}
