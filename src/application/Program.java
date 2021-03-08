package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print (" Is there na initial deposit? (y/n)");
		char option = sc.next().charAt(0);
		
		double initialDeposit = 0;
		
		if(option == 'y') {
			System.out.println("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new Account (number, holder, initialDeposit);
		}
		else {
			account = new Account (number, holder);
		}
	
		System.out.println();
		System.out.println("Account data: " + account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);

		System.out.println("Account data: " + account);	
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println("Account data: " + account);	
		
		sc.close();

	}

}
