package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Anna");
		lista.add("Alberto");
		lista.add("Bianca");
		lista.add("Pablo");
		lista.add("Vit�ria");
		lista.add("Guilherme");
		lista.add("Silva");
		lista.add("Welington");
		lista.add("Sabrina");
		lista.add("Pedro");
		lista.add("Gustavo");
		lista.add("Gabriel");
		
		lista.add(2, "Marcos");
		
		System.out.println(lista.size());
		System.out.println("***************");
		
		for (String nomes : lista) {
			System.out.println(nomes);
		}
		
		//Remove todos os nomes que come�a com A
		System.out.println("***************");
		lista.removeIf(x -> x.charAt(0) == 'A');
		for (String nomes : lista) {
			System.out.println(nomes);
		}
		
		System.out.println("***************");
		System.out.println("Posi��o de Pablo na lista: " + lista.indexOf("Pablo"));
		System.out.println("Posi��o de Gustavo na lista: " + lista.indexOf("Gustavo"));
		System.out.println("***************");
		
		//Mant�m a lista original 'lista', criando uma nova filtrada.
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		System.out.println("Lista filtrada: ");
		for (String filtrados : result) {
			System.out.println(filtrados);
		}
		System.out.println();
		System.out.println("Lista original: ");
		System.out.println(lista);
		System.out.println("***************");
		
		//Procura o primeiro nome da lista com a letra 'G', caso n�o encontre lan�a o erro 'Nome n�o encontrado'
		//Caso 1: Existe
		String nomeBuscado = lista.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse("Nome n�o encontrado");
		System.out.println(nomeBuscado);
		System.out.println("***************");
		
		//Caso 2: N�o existe
		String nomeBuscado2 = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("Nome n�o encontrado");
		System.out.println(nomeBuscado2);
		System.out.println("***************");
	}
}