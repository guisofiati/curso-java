import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		if (N % 2 == 0) {
//			System.out.println("PAR");
//		}
//		else {
//			System.out.println("IMPAR");
//		}
		
		int numero, resto;
		
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		resto = numero % 2;
		
		if (resto == 0) {
			System.out.println("O numero � par");
		} else {
			System.out.println("O numero � impar");
		}
		sc.close();
	}
}