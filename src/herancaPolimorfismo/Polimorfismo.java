package herancaPolimorfismo;

import entities.Account3;
import entities.SavingsAccount;

public class Polimorfismo {

	public static void main(String[] args) {
		
		Account3 x = new Account3(1020, "Alex", 1000.0);
		Account3 y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withDraw(50.0);
		y.withDraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
