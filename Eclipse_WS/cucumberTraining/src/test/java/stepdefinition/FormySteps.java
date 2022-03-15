package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormySteps {

	WebDriver driver =null;
	@Given("User is on Registration Page")
	public void user_is_on_registration_page() {
		System.out.println("User Registration page launching");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://formy-project.herokuapp.com/form");
	}

	@When("User Enter first Name")
	public void user_enter_first_name() {
		System.out.println("User entering first name");
		driver.findElement(By.id("first-name")).sendKeys("MyFirstName");
	}

	@When("User Enter last Name")
	public void user_enter_last_name() {
		System.out.println("User entering last name");
		driver.findElement(By.id("last-name")).sendKeys("My LST tName");
	}
	@When("User Enter jobtitile")
	public void user_enter_jobtitile() {
		System.out.println("User entering title name");
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
	}

	@When("User click on Submit")
	public void user_click_on_submit() {
		System.out.println("User click on Submit");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
	}

	@Then("User validate success message")
	public void user_validate_success_message() {
		System.out.println("Success message ");
		String successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		System.out.println(successMsg);
		driver.close();
		driver = null;
	}

}
