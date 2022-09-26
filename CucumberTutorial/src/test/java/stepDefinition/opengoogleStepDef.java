package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.node.BooleanNode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class opengoogleStepDef {
	WebDriver driver;

@Given("user is entering google.in")
public void user_is_entering_google_in() {
    // Write code here that turns the phrase above into concrete actions
    WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
    driver.get("https://www.google.co.in");
}

@When("user is typing search term {string}")
public void user_is_typing_search_term(String searchterm) {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//*[@name='q'][@type='text']")).sendKeys(searchterm);
}

@When("enters the return key")
public void enters_the_return_key() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@name='q'][@type='text']")).sendKeys(Keys.ENTER);
}

@Then("The user should see search result")
public void the_user_should_see_search_result() {
    // Write code here that turns the phrase above into concrete actions
   Boolean status= driver.findElement(By.partialLinkText("Arya")).isDisplayed();
   System.out.println(status);
}


}
