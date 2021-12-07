
public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toUpperCase(); // Tudo maiúsculo
		String s02 = original.toLowerCase(); // Tudo minúsculo
		String s03 = original.trim(); // Remove espaços iniciais em branco
		String s04 = original.strip(); // Remove espaços iniciais em branco
		String s05 = original.substring(2); // Vai imprimir do 2 caracter em diante
		String s06 = original.substring(2, 9); // Vai imprimir do 2 caracter até o 9
		String s07 = original.replace('a', 'x'); //Vai substituir tudo onde tem char 'a' por 'x'
		String s08 = original.replace("abc", "xyz"); //Vai substituir tudo onde tem string 'abc' por 'xyz'
		int i = original.indexOf("bc"); // Primeira ocorrência da string 'bc'
		int j = original.indexOf('d'); // Primeira ocorrência do caracter 'b'
		int k = original.lastIndexOf("bc"); // Ultima ocorrência da string 'bc'
		
		String s09 = "banana abacaxi morango laranja";
		String[] vect1 = s09.split(" "); // Cria um vetor que pega os elementos de s09 separados por espaço
		String primeiro = vect1[0]; // Da para jogar na variável também
		
		String s10 = "carne, batata, cenoura";
		String[] vect2 = s10.split(", "); // Cria um vetor que pega os elementos de s10 separados por virgula espaço
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toUpperCase -" + s01 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase -" + s02 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("trim -" + s03 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("strip -" + s04 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("substring(2) -" + s05 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("substring(2,9) -" + s06 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("replace('a', 'x') -" + s07 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("replace('abc', 'xyz') -" + s08 + "-");
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("indexOf('bc'): " + i);
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("indexOf('b'): " + j);
		System.out.println("==============================");
		System.out.println("Original: -" + original + "-");
		System.out.println("lastIndexOf('bc'): " + k);
		System.out.println("==============================");
		System.out.println("*");
		System.out.println("==============================");
		System.out.println(vect1[0]);
		System.out.println(vect1[1]);
		System.out.println(vect1[2]);
		System.out.println(vect1[3]);
		System.out.println("==============================");
		System.out.println(primeiro);
		System.out.println("==============================");
		System.out.println("*");
		System.out.println("==============================");
		System.out.println(vect2[0]);
		System.out.println(vect2[1]);
		System.out.println(vect2[2]);
		System.out.println("==============================");
	}

}
