import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.print("Insira o primeiro valor: ");
		A = sc.nextInt();
		System.out.print("Insira o segundo valor: ");
		B = sc.nextInt();
		System.out.print("Insira o terceiro valor: ");
		C = sc.nextInt();
		System.out.print("Insira o quarto valor: ");
		D = sc.nextInt();
		
		sc.close();
		
		diferenca = ((A * B) - (C * D));
		
		System.out.println();
		System.out.println("A diferença é: " + diferenca);
	}
}