package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExpressionsStepDef {
	
	@Given("I have {int} Laptop")
	public void i_have_laptop(Integer count) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Laptop Count "+count );
	}

	@When("I have {double} CGPA")
	public void i_have_cgpa(Double cgpa) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("CGPA: "+cgpa);
	}

	@When("My name is {string}")
	public void my_name_is(String name) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Name : "+name);
	}

}
