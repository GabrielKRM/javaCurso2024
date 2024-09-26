package cursoJava2024;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		 System.out.println("digite sua velocidade: ");
			int velocidade1 = Scanner.nextInt(); 	
		
		if ( velocidade1 > 4) {
			System.out.println(velocidade1+ " hmm, meio lento mas mantenha o ritmo, voce consegue!");
			}else if ( velocidade1 < 6 ) { 
				System.out.println( velocidade1+ " ei! voce ta na media, continua tu consegue");
			
				
			}
}
}