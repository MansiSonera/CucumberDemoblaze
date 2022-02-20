package stepdefinitionpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class carts {
	WebDriver driver;
	@Given("User must be on the product page")
	public void user_must_be_on_the_product_page() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   driver=new ChromeDriver();
		   Thread.sleep(2000);
		   driver.get("https://demoblaze.com/prod.html?idp_=8");

	}

	@And("User clicks on Add to Cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
	}

	@When("An alert pops up which is handle by accepting it")
	public void an_alert_pops_up_which_is_handle_by_accepting_it() throws InterruptedException {
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		String alertmsg =driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		al.accept();
	}

	@And("User clicks on Cart button")
	public void user_clicks_on_cart_button() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.id("cartur")).click();
	}
	
	
}
