import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorRecebidoPorHora, salario;
		
		System.out.print("Informe o n�mero do funcionario: ");
		numeroFuncionario = sc.nextInt();
		System.out.print("Informe o n�mero de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Informe o valor recebido por hora: ");
		valorRecebidoPorHora = sc.nextDouble();
		
		sc.close();
		
		salario = valorRecebidoPorHora * horasTrabalhadas;
		
		System.out.println();
		System.out.printf("Funcion�rio n�mero %d. Sal�rio de: R$ %.2f%n", numeroFuncionario, salario);
	}
}