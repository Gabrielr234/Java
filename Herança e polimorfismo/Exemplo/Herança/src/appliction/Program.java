package appliction;

import entities.Acount;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Acount acc = new Acount(1001, "alex", 0);

		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0, 500);

		// upcasting

		Acount acc7 = bacc;
		Acount acc8 = new BusinessAccount(1003, "bob", 0.0, 200.0);
		Acount acc6 = new SavingsAccount(1004, "anna", 0.0, 0.01);

		// downcasting
//
		//BusinessAccount acc8 = (BusinessAccount) acc2;
		//acc8.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc6 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc6;
			acc5.loan(200.0);
			System.out.println("Loan!: ");
		}
		if (acc6 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc6;
			acc5.updateBalance();
			System.out.println("update!");
		}
		
		
		Acount acc1 = new Acount(1001, "alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Acount ac2= new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		ac2.withdraw(200.0);
		System.out.println(ac2.getBalance());
		
	  Acount acc3 = new BusinessAccount(1003,"bob",1000.0, 5);
	acc3.withdraw(200.0);
	System.out.println(acc3.getBalance());
	}

}
