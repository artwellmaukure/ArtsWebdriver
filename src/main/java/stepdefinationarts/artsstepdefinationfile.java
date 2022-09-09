package stepdefinationarts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class artsstepdefinationfile {

	WebDriver driver;
	String siteurl = "https://Google.com";
	String expectedTitle = "Google";
	
	@Given("I launch browser")
	public void i_launch_browser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
	   
	}

	@When("I open the Google page")
	public void i_open_the_google_page() {
	   
		driver.get(siteurl);
	}

	@Then("I verify that the title is Google")
	public void i_verify_that_the_title_is_google() {
	    
		//String actualTitle = driver.findElement(By.xpath("//*[@id=\"logo\"]")).getText();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}

	@Then("close browser")
	public void close_browser() {
	    System.out.println("The title on the browser has been verified  and its now now closing");
	}

}
