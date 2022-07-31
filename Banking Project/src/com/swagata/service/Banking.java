package com.swagata.service;
import java.util.*;

public class Banking {
	
	int bankBalance=1000;
	Scanner sc= new Scanner(System.in);	
	OTPGenerator otpG=new OTPGenerator();
	public void deposit()
	{
		System.out.println("Enter the amount you want to deposit:");
		int amount=sc.nextInt();
		
		
		if(amount>0)
		{
			System.out.println("Amount "+amount+" deposit successfully");
			bankBalance=bankBalance+amount;
			System.out.println("Current Balance= "+bankBalance);
		}
		else
		{
			System.out.println("Enter the correct amount:");
		}
	}
		public void withdraw()
		{
			System.out.println("Enter the amount you want to withdraw:");
			int amount=sc.nextInt();
			
			
			if(amount>0 && bankBalance-amount>0)
			{
				System.out.println("Amount "+amount+" withdrwal successfully");
				bankBalance=bankBalance-amount;
				System.out.println("Current Balance= "+bankBalance);
			}
			else
			{
				System.out.println("Insufficient Balance:");
			}
			
		}
		
		public void transfer()
		{
			int amount;
			int otp;
			int otpGenerated;
			int bankAccountNo;
			System.out.println("Enter the otp");
			otpGenerated=otpG.generateOTP();
			System.out.println(otpGenerated);
			otp=sc.nextInt();
			if(otp==otpGenerated)
			{
				System.out.println("OTP verification successful");
				System.out.println("Enter the bank acount no to which you want to transfer");
				bankAccountNo=sc.nextInt();
				System.out.println("Enter the amount you want to transfer:");
				amount=sc.nextInt();
				if(amount>0 && bankBalance-amount>0)
				{
					System.out.println("Amount "+amount+" tranfer successfully to bank account "+bankAccountNo);
					bankBalance=bankBalance-amount;
					System.out.println("Current Balance= "+bankBalance);
				}
				else
				{
					System.out.println("Insufficient Balance:");
				}
				
			}
			else
			{
				System.out.println("Invalid otp,try again");
				
			}
			
			
		}
}
