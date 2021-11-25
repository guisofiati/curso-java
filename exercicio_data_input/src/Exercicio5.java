import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
		double valorPeca1, valorPeca2, valorTotal, soma1, soma2;
		
		System.out.println("Insira o código, quantidade e valor unitário da peça 1");
		codigoPeca1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		System.out.println("Insira o código, quantidade e valor unitário da peça 2");
		codigoPeca2 = sc.nextInt();
		numeroPecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		sc.close();

		soma1 = valorPeca1 * numeroPecas1;
		soma2 = valorPeca2 * numeroPecas2;
		
		valorTotal = soma1 + soma2;
		
		System.out.printf("Valor a pagar: R$: %.2f%n", valorTotal);
	}
}