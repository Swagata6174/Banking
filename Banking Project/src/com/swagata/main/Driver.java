package com.swagata.main;
import java.util.Scanner;
import com.swagata.service.Banking;
import com.swagata.model.Customer;

public class Driver {
	
	public static void main(String args[])
	{
		Customer customer1 = new Customer("123456","password");
		Banking banking=new Banking();
		Scanner sc=new Scanner(System.in);
		String bankAccountNo;
		String password;
		int option;
		System.out.println("Welcome to login page\n");//     \n is for append new line.
		System.out.println("Enter the bank account no:");
		bankAccountNo=sc.nextLine();
				System.out.println("Enter the password for bank account:");
		password=sc.nextLine();
		if(customer1.getBankAccountNo().equals(bankAccountNo) &&
				customer1.getPassword().equals(password))
		{
			System.out.println("Welcome to Indian Bank\n");
			do {
				System.out.println("------------------------------------------------------");
				System.out.println("Please enter the operation you want to perform");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer");
				System.out.println("0. Logout");
				System.out.println("-------------------------------------------------------");
				
				option=sc.nextInt();
				
				
				
				switch(option)
				{
				case 0:
					break;
				case 1:
					//deposit
					banking.deposit();
					break;
				case 2:
					//withdraw
					banking.withdraw();
					break;
				case 3:
					//transfer
					banking.transfer();
					break;
				default:
					System.out.println("Invalid Option");
				}
				
			}while(option !=0);
			System.out.println("Exited Successfully");
		}
		
		else
		{
			System.out.println("Invalid Credentials");
		}
		
	}

}
