import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double pi = Math.PI;
		
		System.out.println(pi);
		
		System.out.print("Insira o valor do raio do círculo: ");
		raio = sc.nextDouble();
		
		sc.close();
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("O valor da área desse círculo é: %.4f%n", area);
	}
}
