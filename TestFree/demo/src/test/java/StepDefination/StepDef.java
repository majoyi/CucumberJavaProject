package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	// RestaurantMenuItem NewMenu;
	WebDriver driver;

	String strUrl = "http://demo.guru99.com/";
	String strName = "Test";
	String strSurname = "Testing";
	String strEmail = "testing@gmail.com";
	String strDescription = "The desceroptpit ";
	String strMobileContact = "0785412552";
	SeleniumSteps sTest;

@Given("Chrome Browser is open Navigate to Url:{string}")
public void chrome_browser_is_open_navigate_to_url(String string) {
    // Write code here that turns the phrase above into concrete actions

	String strUrl = string;
    System.out.println("Test Cucumber test1");
	SeleniumSteps sStep = new SeleniumSteps();
	sStep.NavigateToUrl(strUrl);
}
@When("Click on Telecom header")
public void click_on_telecom_header() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
   System.out.println("Test Cucumber test2");
}
@Then("Click Add Members")
public void click_add_members() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("Test Cucumber test3");
}
@Given("Client details Name :{string}, Surname :{string} , Email :{string} and Address:{string}.")
public void client_details_name_surname_email_and_address(String string, String string2, String string3, String string4) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("Test Cucumber test4");
}

/**
Validate google searh is working(Features to test google search)  Time elapsed: 0.015 sec  <<< ERROR!
io.cucumber.junit.UndefinedStepException: The step 'Browser is open' and 4 other step(s) are undefined.
You can implement these steps using the snippet(s) below:
**/
@Given("Browser is open")
public void browser_is_open() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("User is on google search box")
public void user_is_on_google_search_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User enters text a text search box")
public void user_enters_text_a_text_search_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Hits enter")
public void hits_enter() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User is navigated to search results")
public void user_is_navigated_to_search_results() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}


	class SeleniumSteps {
		private String sUrl;

		public SeleniumSteps() {
			// TODO Auto-generated constructor stub

		}

		WebDriver driver;

		public void NavigateToUrl(String strUrl) {
			sUrl = strUrl;
			// System Property for Chrome Driver
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

			// Instantiate a ChromeDriver class.
			driver = new ChromeDriver();

			// Launch Website
			driver.navigate().to(sUrl);

			// Maximize the browser
			driver.manage().window().maximize();

			// Scroll down the webpage by 5000 pixels
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scrollBy(0, 5000)");

			// Click on the Search button
			// driver.findElement(By.linkText("Core Java")).click();

		}

		// Click Selenium Button
		public void ClickButton(String sType, String sId) {

			// driver.findElement(By.id(sId)).click();
			if (sType == "id")
				driver.findElement(By.id(sId)).click();
			else if (sType == "xpath")
				driver.findElement(By.xpath(sId)).click();
			else if (sType == "name")
				driver.findElement(By.name(sId)).click();
			else if (sType == "css")
				driver.findElement(By.cssSelector(sId)).click();
			// *[@id="search_widget"]/form/input[2]
		}

		public void SetText(String sType, String sId, String sItem) {
			if (sType == "id")
				driver.findElement(By.id(sId)).sendKeys(sItem);
			else if (sType == "xpath")
				driver.findElement(By.xpath(sId)).sendKeys(sItem);
			else if (sType == "name")
				driver.findElement(By.name(sId)).sendKeys(sItem);
			else if (sType == "css")
				driver.findElement(By.cssSelector(sId)).sendKeys(sItem);

			// *[@id="search_widget"]/form/input[2]
		}

		public String getsUrl() {
			return sUrl;
		}

		public void setsUrl(String sUrl) {
			this.sUrl = sUrl;
		}

	}


