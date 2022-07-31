package com.swagata.service;

public class OTPGenerator {

	
	public int generateOTP()
	{
		int randomPin=0;
		randomPin=(int)   (Math.random()*9000)+1000;
		
		// Math.random();
		// min=0.0    max=0.9999
		// min=0.0*9000=0+1000=1000     max=0.9999*9000=8999+1000=9999
		return randomPin;
	}
}
