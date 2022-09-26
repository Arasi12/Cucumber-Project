package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithDataDef {
	WebDriver driver;

@Given("User opens the Login page")
public void user_opens_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("User enters valid {string} and {string}")
public void user_enters_valid_and(String string1, String string2) {
    // Write code here that turns the phrase above into concrete actions
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string1);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
}

@When("clicks on the login button")
public void clicks_on_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("user is navigated to home page")
public void user_is_navigated_to_home_page() {
	 String flagString="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	    if(driver.getCurrentUrl().equals(flagString)) {
	    	System.out.println("Home page is displayed");
	    }
}

	
}
