package herancaPolimorfismo;

import entities.Account3;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Sobreposicao {

	public static void main(String[] args) {
		
		Account3 acc1 = new Account3(1001, "Alex", 1000.0);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account3 acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());

		Account3 acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
