package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Finally é executado independentemente se aconteça erro.
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Invalid input.");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Invalid position.");
		} finally {
			System.out.println("End of program");
		}
		
		sc.close();
	}
}