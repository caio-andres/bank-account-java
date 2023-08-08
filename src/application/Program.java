package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account acc = new Account(number, name, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double enterWithdraw = sc.nextDouble();
			acc.withdraw(enterWithdraw);
			System.out.println();
			System.out.println(acc);
		} catch (Exception e) {
			System.out.print("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
