package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDef {
WebDriver driver;

@Given("User is on the Login page")
public void user_is_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
   driver= new ChromeDriver();
   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("User enters the valid username and password")
public void user_enters_the_valid_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
}

@When("clicks the login button")
public void clicks_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("user should be navigated to home page")
public void user_should_be_navigated_to_home_page() {
    // Write code here that turns the phrase above into concrete actions
    String flagString="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
    if(driver.getCurrentUrl().equals(flagString)) {
    	System.out.println("Home page is displayed");
    }
}
	
}
