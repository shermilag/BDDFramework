package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");		
	}
	
	@When("^tittle of login page is free CRM$")
	public void tittle_of_login_page_is_free_CRM() {
	  String title = driver.getTitle();
	  System.out.println(title);  	 
	  Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()throws InterruptedException{
//		Thread.sleep(5000);
//	  driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement loginBtn =
			 driver.findElement(By.xpath("//input[@type='submit']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
	    String title = driver.getTitle();
	    System.out.println("Home page title::"+title);
	    Assert.assertEquals("CRMPRO", title);
	    
	}
	
	@Then("^close the browser$")
	public void close_the_browser(){
	  driver.quit();
	}


	
	
	
	
	
	
	
}
