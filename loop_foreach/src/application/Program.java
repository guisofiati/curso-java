package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "João", "Pedro"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		
		// Tipo, nome que será atribuído a cada elemento, e a lista que será percorrida.
		// Leitura: Para cada 'nome' contido em 'vect' faça: 
		for (String nome : vect) {
			System.out.println(nome);
		}
	}
}