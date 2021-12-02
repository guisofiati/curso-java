import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		while (senha != 2002) {
			senha = sc.nextInt();
			System.out.println("Senha inválida");
		}
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}