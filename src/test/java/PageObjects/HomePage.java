package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[@class='dropdown-toggle' and @title='My Account']")
	WebElement linkMyaccount;
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register']")
	WebElement register;
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/login']")
	WebElement login;
	
	public void clickMyaccount() {
		linkMyaccount.click();
	}
	public void clickRegister() {
		register.click();
	}
	public void clickLogin() {
		login.click();
		
	}
}
