package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		Account account = new Account(number, holder);
		
		System.out.print("Is there an initial deposit? (Y/N): ");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			account.setBalance(account.getBalance() + amount);
		} else {
			System.out.println("Initial deposit refused.");
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		sc.close();
	}
}