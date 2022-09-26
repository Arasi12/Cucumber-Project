package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.text.StrSubstitutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableWithHeaderStepDef {
	WebDriver driver;
	@Given("User enters url of Login page")
	public void user_enters_url_of_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid uname and pswd")
	public void user_enter_valid_uname_and_pswd(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> keyval= dataTable.asMaps(String.class,String.class);
		String uname= keyval.get(2).get("username");
		String pwd= keyval.get(2).get("password");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
	}

	@When("selects the login button")
	public void selects_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
}
