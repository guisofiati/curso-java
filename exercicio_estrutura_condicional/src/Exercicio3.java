import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Primeiro numero: ");
		int A = sc.nextInt();
		System.out.print("Segundo numero: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o multiplos");
		} else {
			System.out.println("N�o s�o multiplos");
		}
		sc.close();
	}
}