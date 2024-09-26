package cursoJava2024;

    import java.util.Scanner;


public class Voto {

	public static void main(String[] args) {
	   Scanner Scanner = new Scanner(System.in);
	   //pedir a idade do usuario:
	   System.out.println("digite sua idade: ");
		int idade = Scanner.nextInt();
		
		if(idade < 16) {
		  System.out.println("oops, voce ainda não tem idade para votar!");
		  }else if ( idade >= 16 && idade < 18  || idade > 65 ){
			  System.out.println("opaa, seu voto é facultativo, mas vote, exerça seu direito politico");
			  } else {
				  System.out.println("voce é obrigado a votar, evite pagar multa!");
		  }

	}

}