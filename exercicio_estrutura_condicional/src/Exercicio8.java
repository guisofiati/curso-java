import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double IR;
		
		double salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			IR = 0.0;
		} else if (salario <= 3000.0) {
			IR = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			IR = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			IR = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (IR == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("IR: R$ %.2f%n", IR);
		}
		sc.close();
	}	
}