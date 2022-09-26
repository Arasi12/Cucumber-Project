package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DataTableWithoutHeaderSTEpDEF {
	WebDriver driver;
	@Given("you are on Login page")
	public void you_are_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("you enter valid deatils")
	public void you_enter_valid_deatils(DataTable dataTable1) {

		List<List<String>> credentials =dataTable1.asLists(String.class);
		String uname= credentials.get(0).get(0);
		String pwd= credentials.get(0).get(1);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}

	@When("press the login button")
	public void press_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}	

}
