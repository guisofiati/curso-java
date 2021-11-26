import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.printf("O numero %d é NEGATIVO", numero);
		} else {
			System.out.printf("O numero %d NÃO é negativo", numero);
		}
		sc.close();
	}
}