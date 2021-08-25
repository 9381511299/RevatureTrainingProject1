package hdfcbank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Testcases {
	Employee Em1=new Employee();
	@Test
	public void Test_login() {
		int a=Em1.login(25,"keerthi","keerthi@25");
		assertEquals(0,a);	
	}
	
}
