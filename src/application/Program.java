package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vindo!");
		System.out.println("Enter account data: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Holder: ");
		String holder = sc.nextLine();
		System.out.println("Initial Limit:");
		double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
		//conta pega a retirada da quantia
		acc.withdraw(amount);
		//mostra novo saldo
		System.out.printf("New balance: %.2f", acc.getBalance());
		}
		catch (BusinessException e){
			System.out.println(e.getMessage());
			
		}
		
		
		sc.close();
	}

}
