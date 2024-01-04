package entities;

public class BusinessAccount extends Acount {

	private double LoanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		LoanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return LoanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		LoanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= LoanLimit) {
			balance += amount - 10.0;
		}

	}
}
