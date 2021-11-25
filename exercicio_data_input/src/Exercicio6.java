import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		sc.close();
		
		// Dividir por 2 o resultado da multiplicação da base (b) pela altura (h)
		areaTrianguloRetangulo = (A * C) / 2;
		
		// PI multiplicado pelo raio elevado ao quadrado
		areaCirculo = Math.PI * Math.pow(C, 2.0);
		
		// Somar base maior e menor, multiplicar pela altura (h) e dividir por 2
		areaTrapezio = ((A + B) * C) / 2;
		
		// Pegar a base (b) ou altura (h) e elevar a 2.
		areaQuadrado = Math.pow(B, 2.0);
		
		// Multiplicar a base (b) pela altura (h)
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO RETANGULO = %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO = %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO = %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO = %.3f%n", areaRetangulo);
	}
}