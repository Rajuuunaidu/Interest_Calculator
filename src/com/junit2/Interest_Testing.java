package com.junit2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Interest_Testing {
	
	/* creating test object for the InterestCalculator */
	
	InterestCalculator test=new InterestCalculator();
	
	@Test
	/*Simple_interest Test Cases */
	void simple_interest_test_pass() {
		assertEquals(60,test.simple_interest(1000,2,3),"simple_interest()  Executed Succsesfully");
		/* calling simple_interest() in the InterestCalculator class */
		assertEquals(577.5,test.simple_interest(5500, 5, 2.1),"simple_interest()  Executed Succsesfully");
		assertEquals(14400,test.simple_interest(20000,12,6),"simple_interest()  Executed Succsesfully");
		assertEquals(760000,test.simple_interest(100000,76,10),"simple_interest()  Executed Succsesfully");
		assertEquals(967500,test.simple_interest(250000,43,9),"simple_interest()  Executed Succsesfully");
		
	}
	
	@Test
	public void test_simple_interest_failure() {
		
		/* testing failure conditions of simple_interest */
		assertFalse(test.simple_interest(200,4, 5)!=40,"simple_interest()  Executed Succsesfully");
		assertFalse(160000!=test.simple_interest(800000,4, 5),"simple_interest()  Executed Succsesfully");
	}
	
	@Test
	/*compound_interest Test cases*/
	void compound_interest_test_pass()
	{
		assertEquals(1333.0992,test.compound_interest(1200,2,5.4),"compound_interest()  Executed Succsesfully");
		/* calling simple_interest() in the InterestCalculator class */
		assertEquals(57288.6,test.compound_interest(54000,2,3),"compound_interest()  Executed Succsesfully");
		assertEquals(5229162.479006264,test.compound_interest(600000,32,7),"compound_interest()  Executed Succsesfully");
		assertEquals(1060.8999999999999,test.compound_interest(1000,2,3),"compound_interest()  Executed Succsesfully");
		assertEquals(5053383.935483341,test.compound_interest(653000,24,8.9),"compound_interest()  Executed Succsesfully");
	}
	@Test
	public void test_compound_interest_failure() {
		
		/* testing failure conditions of compound_interest */
		assertFalse(test.compound_interest(200,4, 5)!=243.10125000000005,"compound_interest()  Executed Succsesfully");
		assertFalse(972405.0000000002!=test.compound_interest(800000,4, 5),"compound_interest()  Executed Succsesfully");
	}
	

}
