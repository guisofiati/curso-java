package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Entre com as medidas de X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas de Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("�rea de X: %.4f%n", areaX);
		System.out.printf("�rea de Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("�rea maior: X");
		} else {
			System.out.println("�rea maior: Y");
		}
		
		sc.close();
	}
}