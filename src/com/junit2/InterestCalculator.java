package com.junit2;

public class InterestCalculator {
	
	public  double simple_interest(double principle,double time,double rate)
	{
		return (principle*time*rate)/100; /* calculating the simple interest and returning the result */
	}
	public  double compound_interest(double principle,double time,double rate)
	{
		return (principle * 
                (Math.pow((1 + rate / 100), time))) ; /* calculating the compound interest and returning the result */
	}

}
