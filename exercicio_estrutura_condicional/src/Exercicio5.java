import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod;
		String esp;
		int qtd;
		double preco = 0.0;
		
		System.out.print("Digite o código do produto: ");
		cod = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		qtd = sc.nextInt();
		
		switch (cod) {
		
		case 1:
			esp = "Cachorro quente";
			preco = 4.00 * qtd;
			break;
			
		case 2:
			esp = "X-Salada";
			preco = 4.50 * qtd;
			break;
			
		case 3:
			esp = "X-Bacon";
			preco = 5.00 * qtd;
			break;
			
		case 4:
			esp = "Torrada simples";
			preco = 2.00 * qtd;
			break;
			
		case 5: 
			esp = "Refrigerante";
			preco = 1.50 * qtd;
			break;
			
		default: 
			esp = "Não há um produto com esse código";
			break;
		}
		
		System.out.printf("Produto: %s, valor a pagar: R$ %.2f", esp, preco);
		
		sc.close();
	}
}