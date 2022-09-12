/**
 * 
 */
package orangeHRMtests;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import orangeHRMpages.OrangeHRMHomePage;
import orangeHRMpages.OrangeHRMLoginPage;

/**
 * @author Artwell
 *
 */
public class LoginPagetests {
	WebDriver driver;
	String siteURl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	OrangeHRMLoginPage loginpage;
	OrangeHRMHomePage orangeHRMHomePage;
	@BeforeMethod 
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(siteURl);
		
		
	}
	
	
	@Test(priority =2)
	public void verifyLogo() {
		driver = new ChromeDriver();
		loginpage = new OrangeHRMLoginPage(driver);
		boolean flag = loginpage.validateLogo();
		Assert.assertTrue(flag);
		
		
		
	}
	@Test(priority =1)
	public void verifyLogin() {
		driver = new ChromeDriver();
		loginpage = new OrangeHRMLoginPage(driver);
		orangeHRMHomePage =loginpage.Login();
		String actualURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		String expectedURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		
		
	}

}
