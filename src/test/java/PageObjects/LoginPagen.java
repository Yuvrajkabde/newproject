package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagen extends BasePage {
	WebDriver driver;
	public LoginPagen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement userid;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement userpass;
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbutton;
	
	public void setUserName(String username) {
		userid.sendKeys(username);
	}
	public void setPassword(String password) {
		userpass.sendKeys(password);
	}
	public void clickbutton() {
		loginbutton.click();
	}
	

}
