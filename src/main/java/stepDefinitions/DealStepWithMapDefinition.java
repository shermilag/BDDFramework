package stepDefinitions;

    
    import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

	public class DealStepWithMapDefinition {
		
		WebDriver driver;
		
		@Given("^enduser is on login page$")
		public void enduser_is_on_login_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.freecrm.com");
		}
		
		@Then("^user enters username and password$")		
		public void user_enters_username_and_password(DataTable credentials) {			
			for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
	
				driver.findElement(By.name("username")).sendKeys(data.get("username"));
     			driver.findElement(By.name("password")).sendKeys(data.get("password"));
	
		}
	
	}
		
		@Then("^Then user clicks on login button$")
		public void user_clicks_on_login_button() throws InterruptedException {
			
//			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			WebElement loginBtn =
		    driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
 			js.executeScript("arguments[0].click();", loginBtn);
 
		}
		

		@Then("^user moves to new deal page$")
		public void user_moves_to_new_deal_page(){
		 driver.switchTo().frame("mainpanel");
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
		 driver.findElement(By.xpath("//a[@title='New Deal']")).click();
		}

		@Then("^user enters deal details$")
		public void user_enters_deal_details(DataTable dealData) {
			for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			driver.findElement(By.xpath("\\\\input[@type='submit' and @value='Save']")).click();//save button
			
			//move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
	}
		

		@Then("^user will close the browser$")
		public void user_will_close_the_browser() {
			driver.quit();
		}
		
		
		
		
		
		

	}


