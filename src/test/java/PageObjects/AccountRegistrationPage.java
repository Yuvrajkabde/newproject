package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends HomePage {
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pass;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cnfpass;
	@FindBy(xpath="//input[@name='agree']")
	WebElement terms;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuef;

	
	public void setFirstName(String name) {
		firstname.sendKeys(name);
	}
	public void setLastName(String lname) {
		lastname.sendKeys(lname);
	}
	public void setEmail(String emailaddress) {
		email.sendKeys(emailaddress);
	}
	public void setTelephone(String num) {
		telephone.sendKeys(num);
	}
	public void setPass(String password) {
		pass.sendKeys(password);
	}
	public void setCnfpass(String password) {
		cnfpass.sendKeys(password);
	}
	public void clickTerms() {
		terms.click();

	}
	public void clickContinue() {
		continuef.click();
	}



}
