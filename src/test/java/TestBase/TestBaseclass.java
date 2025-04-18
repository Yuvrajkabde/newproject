package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseclass {
	public WebDriver driver;
	public String username="yuviuc456@gmail.com";
	public String password="Yuvraj798$";
	
	@BeforeClass
	public void setup() {
		driver=(WebDriver) new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
