package programming.labs.lab1301threads.meta.bank;

public class CheckingAccount extends Account {

	private static final double COMMITION = 0.05;

	public CheckingAccount(double balance) {
		super(balance);
	}

	public double withdraw(double amount) {
		if (amount * (1 + COMMITION) <= getBalance()) {
			setBalance(getBalance() - (amount * (1 + COMMITION)));
			return amount * (1 + COMMITION);
		} else {
			throw new OverdraftException(
					"The amount bigger than the balance!!!");
		}
	}

}
