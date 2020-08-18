package stepDefination;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplicationSteps {
	int a, b, result;

	@Given("^I have two variables \"(.*)\" & \"(.*)\"$")
	public void i_have_two_variables_a_b(String num1, String num2) throws Throwable {
		System.out.println("@ Given section");
		// a=10;
		a = Integer.parseInt(num1);
		b = Integer.parseInt(num2);
	}

	@Given("^I have two variables as below$")
	public void i_have_two_variables_as_below(List<String> numbers) throws Throwable {
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		a = Integer.parseInt(numbers.get(0));
		b = Integer.parseInt(numbers.get(1));
	}

	@Given("^I have two variables as below for DataTable$")
	public void i_have_two_variables_as_below_for_DataTable(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		a = Integer.parseInt(data.get(0).get(0));
		b = Integer.parseInt(data.get(0).get(1));

	}

	@Given("^I have two variables as below for Maps$")
	public void i_have_two_variables_as_below_for_Maps(DataTable table) throws Throwable {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		System.out.println(data.get(0).get("num1"));
		System.out.println(data.get(0).get("num2"));

		a = Integer.parseInt(data.get(0).get("num1"));
		b = Integer.parseInt(data.get(0).get("num2"));
	}

	@Given("^I have two variables as below for Map$")
	public void i_have_two_variables_as_below_for_Map(DataTable table) throws Throwable {
		Map<String,String> data=table.asMap(String.class, String.class);
		System.out.println(data.get("num1"));
		System.out.println(data.get("num2"));
		a = Integer.parseInt(data.get("num1"));
		b = Integer.parseInt(data.get("num2"));
	}

	@When("^I do multipliction$")
	public void i_do_multipliction() throws Throwable {
		System.out.println("@ When section");
		result = a * b;
	}

	@Then("^Result should display in console$")
	public void result_should_display_in_console() throws Throwable {
		System.out.println("@ Then section");
		System.out.println("Multiplication of Two Number is " + result);
	}
}
