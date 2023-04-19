package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount bacc = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);
		System.out.println(bacc.getBalance());

		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());

		// UPCASTING

		Account acc1 = bacc;
		
		Account acc2 = new BusinessAccount(1500, "Mariana", 1000.0, 500.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new SavingAccount(1500, "Maria", 1000.0, 0.01);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

		// DOWNCASTING

		BusinessAccount bacc1 = (BusinessAccount) acc2;
		bacc1.loan(100.0);

		// BusinessAccount bacc2 = (BusinessAccount)acc3; - verificar se o acc3 é
		// instancia do BusinessAccount

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount) acc3;
			bacc2.loan(200.0);
		}

		if (acc3 instanceof SavingAccount) {
			SavingAccount sacc2 = (SavingAccount) acc3;
			sacc2.updateBalance();
		}
	}
}