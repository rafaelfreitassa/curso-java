package aulaexcecoes;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.println("Numero: ");
		int number = sc.nextInt();
		System.out.println("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Saldo Inicial: ");
		double balance = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double withDrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withDrawLimit);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("Novo saldo %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
