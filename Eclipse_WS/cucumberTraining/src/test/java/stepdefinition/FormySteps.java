package stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormySteps extends BaseClass{

//	WebDriver driver = null;

	@Given("User is on Registration Page")
	public void user_is_on_registration_page() {
		System.out.println("User Registration page launching");
		driver = getDriver();
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

	@Given("user launch formyApplication")
	public void user_launch_formy_application() {
		System.out.println("User Registration page launching");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://formy-project.herokuapp.com/form");
	}
	@When("user enter all the details and validate the success msg in list")
	public void user_enter_all_the_details_and_validate_the_success_msg_in_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			List<List<String>> data = dataTable.asLists();
			
			int totalElements = data.size();
			String fn,ln,job, edu, s, yoe;
			for (int i = 0; i < totalElements ; i++) 
			{
				fn = data.get(i).get(0);
				ln = data.get(i).get(1);
				job = data.get(i).get(2);
				edu = data.get(i).get(3);
				driver.findElement(By.id("first-name")).sendKeys(fn);
				driver.findElement(By.id("last-name")).sendKeys(ln);
				driver.findElement(By.id("job-title")).sendKeys(job);
				
				switch (edu) {
				case "High School":
					driver.findElement(By.id("radio-button-1")).click();
					break;
				case "College":
					driver.findElement(By.id("radio-button-2")).click();
					break;
				case "Grad School":
					driver.findElement(By.id("radio-button-3")).click();
					break;

				default:
					System.out.println("Please check the input");
					break;
				}
				
				driver.findElement(By.xpath("//a[text()='Submit']")).click();
				System.out.println("Success message ");
				String successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
				System.out.println(successMsg);
				Thread.sleep(3000);
				driver.get("http://formy-project.herokuapp.com/form");
			}
			
	}

	@When("user enter all the details and validate the success msg")
	public void user_enter_all_the_details_and_validate_the_success_msg(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps();
		int totalElements = data.size();
		String fn,ln,job, edu, s, yoe;
		for (int i = 0; i < totalElements ; i++) 
		{
			fn = data.get(i).get("firstname");
			ln = data.get(i).get("lastname");
			job = data.get(i).get("jobtitle");
			edu = data.get(i).get("education");
		//	s = data.get(i).get("Sex");
		//	yoe = data.get(i).get("yoe");
			
			driver.findElement(By.id("first-name")).sendKeys(fn);
			driver.findElement(By.id("last-name")).sendKeys(ln);
			driver.findElement(By.id("job-title")).sendKeys(job);
			
			switch (edu) {
			case "High School":
				driver.findElement(By.id("radio-button-1")).click();
				break;
			case "College":
				driver.findElement(By.id("radio-button-2")).click();
				break;
			case "Grad School":
				driver.findElement(By.id("radio-button-3")).click();
				break;

			default:
				System.out.println("Please check the input");
				break;
			}
			
			driver.findElement(By.xpath("//a[text()='Submit']")).click();
			System.out.println("Success message ");
			String successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			System.out.println(successMsg);
			Thread.sleep(3000);
			driver.get("http://formy-project.herokuapp.com/form");
		}
	}

	@When("close the browser")
	public void close_the_browser() {
		driver.close();
		driver = null;
	}

}
