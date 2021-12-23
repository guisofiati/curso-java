package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("*****END OF PROGRAM*****");

	}
	
	public static void method1() {
		System.out.println("*****METHOD1 START*****");
		method2();
		System.out.println("*****METHOD1 END*****");
	}
	
	public static void method2() {
		System.out.println("*****METHOD2 START*****");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Vai empilhar as chamadas: (Stack trace: Rastro das pilhas)
		 * Tipo erro + valor inserido
		 * Método + linha
		 */
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position.");
			e.printStackTrace();
			sc.next();
		}
		
		System.out.println("*****METHOD2 END*****");
		
		sc.close();
	}
}