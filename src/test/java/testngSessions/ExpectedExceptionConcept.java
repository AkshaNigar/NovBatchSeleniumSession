package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions =Exception.class)  // To make this tc passed
	public void loginTest()
	{
		System.out.println("Login Test");
		int i=9/0; // AE
		
	}

}
