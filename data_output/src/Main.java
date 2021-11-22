import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Teste 1");
		System.out.print("Teste 2 ");
		System.out.println("Teste 3");
		
		int x = 32;
		double y = 10.34563;
		
		String name = "Maria";
		int idade = 30;
		double salario = 4000.0;
		
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y);
		
		System.out.println("O RESULTADO É: " + x + " METROS");
		System.out.printf("O RESULTADO É %.2f%n", y);
		
		System.out.printf("%s ganha %.2f mensais com %d anos de idade", name, salario, idade);
	}
}