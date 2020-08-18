package stepDefination;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UdemySteps {
	static WebDriver driver;

	@Given("^User is on HomePage of Udemy$")
	public void user_is_on_HomePage_of_Udemy() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://udemy.com");
	}

	@When("^User clicks on SignUp link$")
	public void user_clicks_on_SignUp_link() throws Throwable {
		driver.findElement(By.linkText("Sign up")).click();
	}

	@Then("^Sign-Up page should display$")
	public void sign_Up_page_should_display() throws Throwable {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("id_fullname")));
		} catch (Exception E) {
			fail("SingUP Page Not Displayed");
		}
	}

	@Given("^User is on SignUp page of Udemy$")
	public void user_is_on_SignUp_page_of_Udemy() throws Throwable {
		System.out.println(driver);
		assertTrue(driver.findElement(By.xpath("//*[@id='auth-to-udemy-title']")).isDisplayed());
	}

	@When("^User clicks on SignUp button$")
	public void user_clicks_on_SignUp_button() throws Throwable {
		driver.findElement(By.id("submit-id-submit")).click();
	}

	@Then("^User should be on SignUp Page & registration should \"([^\"]*)\" happen$")
	public void user_should_be_on_SignUp_Page_registration_should_happen(String arg1) throws Throwable {
		try {
			new WebDriverWait(driver, 10)
					.until(ExpectedConditions.invisibilityOfElementLocated(By.id("submit-id-submit")));
		} catch (Exception E) {
			if (arg1.equals("not")) {
				System.out.println("Test Passed");
			} else {
				fail("SingUP Negative Test Failed ");
			}
		}
	}

	@When("^User Enters following Details & Clicks on sign up$")
	public void user_Enters_following_Details_Clicks_on_sign_up(DataTable table) throws Throwable {
		Map<String, String> data = table.asMap(String.class, String.class);
		driver.findElement(By.id("id_fullname")).sendKeys(data.get("name"));
		driver.findElement(By.id("email--1")).sendKeys(data.get("email"));
		driver.findElement(By.id("password")).sendKeys(data.get("password"));
		driver.findElement(By.id("submit-id-submit")).click();
	}
}