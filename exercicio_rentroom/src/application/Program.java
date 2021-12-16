package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rent[] quartos = new Rent[10];

		System.out.println("Quantos quartos vão ser alugados? ");
		int quantidade = sc.nextInt();

		for (int i=1; i<quantidade; i++) {
			System.out.println();
			System.out.println("RENT: #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			quartos[quarto] = new Rent(nome, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<10; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		sc.close();
	}
}