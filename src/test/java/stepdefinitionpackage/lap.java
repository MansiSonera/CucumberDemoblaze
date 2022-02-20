package stepdefinitionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class lap {
	WebDriver driver;
	
	@Given("User must be login on his or her account")
	public void user_must_be_login_on_his_or_her_account() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   driver=new ChromeDriver();
		   Thread.sleep(2000);
		   driver.get("https://demoblaze.com/");
	}

	@When("User clicks on Laptops")
	public void user_clicks_on_laptops() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
	}

	@Then("User choose one laptop to purchase")
	public void user_choose_one_laptop_to_purchase() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
	}
}
