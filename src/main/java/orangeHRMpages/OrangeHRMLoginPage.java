package orangeHRMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {
	WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By logo = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");
	
	//To initialise our driver
	public OrangeHRMLoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public boolean validateLogo() {
		
		 driver.findElement(logo).isDisplayed();
		 return true;
	}
	
	public OrangeHRMHomePage Login() {
		
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginBtn).click();
		return new OrangeHRMHomePage();
		
		
		
		
	}

}
