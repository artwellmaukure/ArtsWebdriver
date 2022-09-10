package Stepdefinationsfile;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	
	WebDriver driver;
	String siteurl = "https://google.com";
	String expectedTitle = "Gogle";
	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	   
	}

	@Given("I open Google home page")
	public void i_open_google_home_page() {
		driver.get(siteurl);
		driver.manage().window().maximize();
	    
	}

	@Then("I validate page Title")
	public void i_validate_page_title() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	    
	}

	@Then("I close browser")
	public void i_close_browser() {
		
		System.out.println("The browser is closing");
	    
	}


}
