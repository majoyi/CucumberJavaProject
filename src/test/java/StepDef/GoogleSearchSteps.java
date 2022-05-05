package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

WebDriver driver = null;


	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside ste Browser is open");
	System.getProperty("webdriver.chrome.driver","C:/Users/ND5177/eclipse-workspace/CucumberSample1/src/drivers/chromedriver.exe" );		
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	}

	@And("User is on google search box")
	public void user_is_on_google_search_box() {
		System.out.println("Inside step, User is on google page");
			}

	@When("User enters text a text search box")
	public void user_enters_text_a_text_search_box() {
		System.out.println("Inside step usr Enters text");
			}

	@When("Hits enter")
	public void hits_enter() {
		System.out.println("Inside step Hit ");
			}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step  USer navigate to search");
			}



}
