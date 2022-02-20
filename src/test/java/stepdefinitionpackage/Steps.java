package stepdefinitionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	
	@Given("User must be on homepage of the website")
	public void user_must_be_on_homepage_of_the_website() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver=new ChromeDriver();
	   Thread.sleep(2000);
	   driver.get("https://demoblaze.com/");
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("login2")).click();
	 }

	@When("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys("june");
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginpassword")).sendKeys("june");
	}

	@Then("User clicks on Login button to Log in")
	public void user_clicks_on_login_button_to_log_in() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}
}
