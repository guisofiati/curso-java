package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Jo�o", "Pedro"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		
		// Tipo, nome que ser� atribu�do a cada elemento, e a lista que ser� percorrida.
		// Leitura: Para cada 'nome' contido em 'vect' fa�a: 
		for (String nome : vect) {
			System.out.println(nome);
		}
	}
}