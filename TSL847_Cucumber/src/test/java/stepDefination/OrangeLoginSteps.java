package stepDefination;

import static org.junit.Assert.fail;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeLoginSteps {
	WebDriver driver;

	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void AfterClass() {
		driver.quit();
	}

	@Given("^Chrome Browser with Login Page is Opened$")
	public void chrome_Browser_with_Login_Page_is_Opened() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User Enters \"([^\"]*)\", \"([^\"]*)\" & Click on Login$")
	public void user_Enters_Click_on_Login(String user, String pwd) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Login \"([^\"]*)\" be happen\\.$")
	public void login_be_happen(String arg1) throws Throwable {
		try {
			new WebDriverWait(driver, 10).until(visibilityOfElementLocated(By.id("welcome")));
		} catch (Exception E) {
			if (arg1.equalsIgnoreCase("ShouldNot")) {
				System.out.println("Negative Test Pass");
			} else
				fail("Login Test Failed");
		} finally {
			driver.quit();
		}
	}

	@Then("^Browser should be get Close$")
	public void browser_should_be_get_Close() throws Throwable {
		driver.quit();
	}

}