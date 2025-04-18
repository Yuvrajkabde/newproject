package TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import TestBase.TestBaseclass;

public class AccountRegistration extends TestBaseclass {
//	WebDriver driver;

	
	@Test
	public void VerifyAccountRegister() {
		AccountRegistrationPage ac=new AccountRegistrationPage(driver);
		HomePage hp=new HomePage(driver);
		
		hp.clickMyaccount();
		hp.clickRegister();
		ac.setFirstName("Rahuhjlsk12");
		ac.setLastName("jadhasdvpk");
		ac.setEmail(username);
		ac.setTelephone("9881947856");
		ac.setPass(password);
		ac.setCnfpass(password);
		ac.clickTerms();
		ac.clickContinue();
	}
	
	

}
