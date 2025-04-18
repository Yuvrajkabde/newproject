package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPagen;
import PageObjects.MyAccountPage;
import TestBase.TestBaseclass;

public class TestLogin extends TestBaseclass {
	
	@Test
	public void testLogin() {
		
		HomePage hp=new HomePage(driver);
		LoginPagen lp=new LoginPagen(driver);
		MyAccountPage mp=new MyAccountPage(driver);
		
		
		
		hp.clickMyaccount();
		hp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickbutton();
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "My Account");
		mp.finalcheckout();
		
	}
	
	

}
