import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta = 's';
		
		while (resposta != 'n') {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n)?");
			resposta = sc.next().charAt(0);
		}
		
		sc.close();
	}
}