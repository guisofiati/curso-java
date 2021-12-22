package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		//Da erro pois Account é abstract
		//Account acc = new Account(1, "Bob", 1000.0);
		Account bacc = new BusinessAccount(2, "Maria", 1000.0, 500.0);
		Account sacc = new SavingsAccount(3, "Alex", 1000.0, 0.01);
		
		list.add(new SavingsAccount(1000, "Pedro", 1000.0, 0.05));
		list.add(new SavingsAccount(1001, "João", 500.0, 0.03));
		list.add(new BusinessAccount(1002, "Marcia", 300.0, 100.0));
		list.add(new BusinessAccount(1002, "Joana", 700.0, 200.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		System.out.println();
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}