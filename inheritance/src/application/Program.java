package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc1 = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		//Atribuindo um objeto da sub-classe para a super-classe
		Account acc2 = bacc1;
		acc2.getBalance();
		
		Account acc3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc4 = new SavingsAccount(1004, "Pedro", 0.0, 0.01);
		
		//DOWNCASTING
		// Converter um objeto da super-classe para a sub-classe
		
		// Da erro, pois o tipo da acc3 é uma Account, então fazemos o casting
		//BusinessAccount acc5 = acc3;
		BusinessAccount acc5 = (BusinessAccount)acc3;
		acc5.loan(100.0);
		
		//Da erro, pois acc4 esta instanciado como SavingsAccount, mesmo sendo do tipo Account
		//BusinessAccount acc6 = (BusinessAccount)acc4;
		
		// Se o que tiver na acc4 for um objeto que seja instancia de BusinessAccount...
		// Vai falhar esse if, executando somente o ultimo if
		if (acc4 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount)acc4;
			acc6.loan(200.0);
			System.out.println("Loan");
		}
		
		if (acc4 instanceof SavingsAccount) {
			SavingsAccount acc7 = (SavingsAccount)acc4;
			acc7.updateBalance();
			System.out.println("Updated");
		}
		
		System.out.println("*************************************");
		System.out.println();
		
		Account acc8 = new Account(100, "Bob Brown", 1000.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());

		System.out.println();
		
		Account acc9 = new SavingsAccount(101, "Maria Green", 1000.0, 0.01);
		acc9.withdraw(200.0);
		System.out.println(acc9.getBalance());
		
		System.out.println();
		
		Account acc10 = new BusinessAccount(102, "Alex", 1000.0, 500.0);
		acc10.withdraw(200.0);
		System.out.println(acc10.getBalance());
		
		System.out.println("*************************************");
		System.out.println();
		
		Account x = new Account(111, "Fulano", 1000.0);
		Account y = new SavingsAccount(112, "Ciclano", 1000.0, 0.01);
		
		// Tipos iguais (Account) mas comportamentos (métodos) diferentes, será descontado 55 de um e apenas 50 de outro
		// Polimorfismo é a capacidade da classe pai de termos comportamentos diferentes para métodos das classes filhas
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}