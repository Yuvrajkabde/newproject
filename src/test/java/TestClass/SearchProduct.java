package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPagen;
import PageObjects.MyAccountPage;
import TestBase.TestBaseclass;

public class SearchProduct extends TestBaseclass {
	
	@Test
	public void testSearchproduct() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		LoginPagen lp=new LoginPagen(driver);
		MyAccountPage mp=new MyAccountPage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickbutton();
		Thread.sleep(5000);
		mp.searchproduct("iPhone");
		Thread.sleep(5000);
		mp.addtocartproduct();
		mp.checkoutProduct();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Shopping Cart");
		
	}
	
	

}
