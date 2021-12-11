package entities;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public void status() {
		if (notaFinal() < 60.00) {
			System.out.printf("NOTA FINAL: %.2f%n", notaFinal());
			System.out.println("REPROVADO");
			double calc = 60.00 - (double) notaFinal();
			System.out.printf("FALTOU: %.2f%n", calc);
		} else {
			System.out.printf("NOTA FINAL: %.2f%n", notaFinal());
			System.out.println("PASSOU");
		}
	}
}
