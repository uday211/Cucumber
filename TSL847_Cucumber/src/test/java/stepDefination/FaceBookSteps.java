package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class FaceBookSteps {
	WebDriver driver;
	@Given("^Chrome Browser is Opened$")
	public void chrome_Browser_is_Opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mprem\\OneDrive\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("^user navigates to URL as \"([^\"]*)\"$")
	public void user_navigates_to_URL_as(String url) throws Throwable {
		driver.get(url);
	}

	@Then("^Title should be as \"([^\"]*)\"$")
	public void title_should_be_as(String expectedTitle) throws Throwable {
		assertTrue(driver.getTitle().contains(expectedTitle));
	}
}
