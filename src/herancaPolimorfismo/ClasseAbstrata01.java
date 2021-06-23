package herancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account4;
import entities.BusinessAccount2;
import entities.SavingsAccount2;

public class ClasseAbstrata01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account4> list = new ArrayList<>();
		
		list.add(new SavingsAccount2(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount2(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount2(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount2(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account4 acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account4 acc : list) {
			acc.deposit(10.0);
		}

		for (Account4 acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		

	}

}
