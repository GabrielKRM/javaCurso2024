package cursoJava2024;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
	 String texto = "bem Vindo ao curso de JAVA";
	 String texto2 = "vamos aprender sobre STRING";
	 
	 //1.Comprimento da string:
	 String nome = "Gabriel Batista funchal";
	 System.out.println("Comprimento da String: "+nome.length());
	 
     //2.Concatenar Strings: 
	    String textoCompleto = texto + " "+ texto2;
	    System.out.println("texto completo: "+ textoCompleto);
//        String nome2 = "gabriel ";
 //       String sobreNome = "funchal";
//        System.out.println(nome2 + sobreNome);
	    
	    //3. converter para letra MAIÚCULAS E minúsculas:
	    System.out.println(" MAIÚCULAS: "+ texto.toLowerCase());
	    System.out.println(" minúsculas: "+ texto.toUpperCase());
	    
	    //4. Substituir uma parte da String:
	    String novoTexto = texto.replace("JAVA", "SEXO");
	    System.out.println("Texto após substituição: " + novoTexto);
	    
	    //5. Buscar por uma substring:
	    int posicao = texto.indexOf("curso");
	    System.out.println("posição da palavra 'curso': "+ posicao);
	    
	    //6. Verificar se uma String começa ou termina com uma substring:
	    System.out.println("começa com 'bem': " + texto.startsWith("bem"));
	    System.out.println("termina com 'bem': " + texto.endsWith("bem"));
	    
	    //7. Dividir String:
	    String[] palavras = textoCompleto.split(" ");
	    System.out.println("palavras nop texto completo:");
	       for ( String palavra : palavras ) {
	    	   System.out.println(palavra);
	    	   
	    //8. Remover espaços em branco:
	    	   String textoComEspacos = "     Texto com espaços     ";
	    	   System.out.println("Texto sem espaços: "+ textoComEspacos.trim() + "'");
	    	   
	       }
	    
	    
	    
	}

}
