import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.println("Deseja repetir (s/n)?");
		char resposta = sc.next().charAt(0);
		
		while (resposta != 'n') {
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n)?");
			resposta = sc.next().charAt(0);
		}
		
		sc.close();
	}
}