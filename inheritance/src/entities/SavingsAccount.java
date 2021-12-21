package entities;

//Com isso, a classe SavingsAccountPlus vai dar erro, pois essa classe est� com o final
public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	//Sobrepos o m�todo da classe Account
	//Se errar o nome do m�todo com o Override, da um erro falando que n�o existe na superclass
	//Anotada com o final esse m�todo n�o podera mais ser sobreposto
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
}