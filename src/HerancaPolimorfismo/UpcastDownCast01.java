package HerancaPolimorfismo;

import entities.Account3;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class UpcastDownCast01 {

	public static void main(String[] args) {
		
		Account3 acc = new Account3(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account3 acc1 = bacc;
		Account3 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account3 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;//erro
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
