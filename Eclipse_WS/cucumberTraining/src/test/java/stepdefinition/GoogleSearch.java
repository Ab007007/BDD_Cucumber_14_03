package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends BaseClass{

//	WebDriver driver  = null;
	@Given("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("User Registration page launching");
		driver = getDriver();
		driver.get("https://www.google.com/");
	}

	@When("user enter {} in search box")
	public void user_enter_synechron_in_search_box(String text) {
		
		driver.findElement(By.name("q")).sendKeys(text);
	}

	@Then("user should get suggestion(s) based on search criteria")
	public void user_should_get_suggestions_based_on_search_criteria() {
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total  number of suggestions " + autoSuggestions.size());
			
	}

	@Then("user will print the suggestion(s)")
	public void user_will_print_the_suggestions() {
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total  number of suggestions " + autoSuggestions.size());
		for (WebElement suggestion : autoSuggestions) {
			System.out.println(suggestion.getText());
		}
	}

	@When("click on serach button")
	public void click_on_serach_button() {
		driver.findElement(By.name("btnK")).click();
	}
	@When("application will display no/more result")
	public void application_will_display_result() {
	    System.out.println("displayed");
	}

	@When("user will print first page search more results")
	public void user_will_first_page_search_results() {
		List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));
		for (WebElement result : searchResults) {
			System.out.println(result.getText());
		}
	}
	
	@Then("user will printall the hyperlinks")
	public void user_will_printall_the_hyperlinks() {
		List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));
		for (WebElement result : searchResults) {
			System.out.println(result.getText());
		}
	}
	@Then("click on first link")
	public void click_on_first_link() throws InterruptedException {
		driver.findElement(By.xpath("(//a[h3])[1]")).click();
		Thread.sleep(5000);
		driver.close();
	}



}
