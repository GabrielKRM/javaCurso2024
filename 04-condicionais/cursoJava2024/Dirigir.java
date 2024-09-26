package cursoJava2024;

import java.util.Scanner;

public class Dirigir {
	
	public static void main(String[] args) {
		   Scanner Scanner = new Scanner(System.in);
		   //pedir a idade do usuario:
		   System.out.println("digite sua idade: ");
			int idade = Scanner.nextInt(); 
	
	    if (idade < 18)
	    	System.out.println("ah que pena, voce é muito jovem para dirigir");
	     if (idade > 18 ) {
	    	System.out.println("wow! voce já tem idade para dirigir");
	    	
	    	
	}
}
}
	    	
