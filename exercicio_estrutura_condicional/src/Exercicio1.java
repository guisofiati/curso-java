import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.printf("O numero %d � NEGATIVO", numero);
		} else {
			System.out.printf("O numero %d N�O � negativo", numero);
		}
		sc.close();
	}
}