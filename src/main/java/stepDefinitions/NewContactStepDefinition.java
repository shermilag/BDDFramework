package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class NewContactStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	  
	}

	@When("^tittle of the login page is free CRM$")
	public void tittle_of_the_login_page_is_free_CRM(){
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user will enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_enter_and(String username, String password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user will click on login button$")
	public void user_will_click_on_login_button(){
		WebElement loginBtn =
				 driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page(){
	  driver.switchTo().frame("mainpanel");
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
	  driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	}
	
	@And("^user will enter \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_will_enter(String firstname, String lastname, String company){
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(company);
	}
			
		
	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button(){
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Save' and @class='button']")).click();
	}
	
//	@Then("^verify users are created$")
//	public void verify_users_are_created(){
//    String Verifytext= driver.findElement(By.tagName("body")).getText().trim(); 
//    Assert.assertEquals(Verifytext, "Adam Guli  ");
//	}

	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
	}
}
