import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, soma;
		
		System.out.print("Insira o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Insira o segundo valor: ");
		valor2 = sc.nextInt();
		
		sc.close();

		soma = valor1 + valor2;
		
		System.out.println("O resultado da soma de " + valor1 + " + " + valor2 + " é igual a " + soma);
	}
}