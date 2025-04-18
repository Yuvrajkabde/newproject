package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div/div[2]/button[@type='button']/i[@class='fa fa-shopping-cart']")
	WebElement addtocart;
	@FindBy(xpath="//input[@class='form-control input-lg']")
	WebElement search;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement clicksearch;
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement checkout;
	@FindBy(xpath="//p/a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']")
	WebElement finalcheck;
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void searchproduct(String product) {
		search.sendKeys(product);
		search.sendKeys(Keys.ENTER);
	}
	public void clicksearchbutton() {
		search.click();
	}
	public void addtocartproduct() {
		addtocart.click();
	}
	public void checkoutProduct() {
		checkout.click();
	}
	public void finalcheckout() {
		finalcheck.click();
	}
	public void logouts() {
		logout.click();
	}


}
