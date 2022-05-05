package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

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
		sTest = new SeleniumSteps();
		sTest.NavigateToUrl(string);
	}

	@When("Click on Telecom header")
	public void click_on_telecom_header() {
		// Write code here that turns the phrase above into concrete actions
		String sId = "//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a";
		sTest.ClickButton("xpath", sId);
		// sTest.ClickButton("xpath",sId);
	}

	@Then("Click Add Members")
	public void click_add_members() {
		// Write code here that turns the phrase above into concrete actions
		String sId = "//*[@id=\"one\"]/div/div[1]/div[1]/h3/a";
		// sTest.ClickButton("xpath",sId);
		sTest.ClickButton("xpath", sId);
	}

	@Given("Client details Name :{string}, Surname :{string} , Email :{string} and Address:{string}.")
	public void clien_details_name_surname_email_and_address(String strName, String strSurname, String strEmail,
			String strDescription) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// @SuppressWarnings("deprecation")
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(1000);
		// Pause(2006);
		// pause(seconds)
		// WebDriver driver => new ChromeDriver();
		// Pauses test execution for specified time in milliseconds
		Thread.sleep(10000);
		String sId = "//*[@id=\"done\"]";
		sTest.ClickButton("xpath", sId);
		;

		sTest.SetText("name", "fname", strName);

		sTest.SetText("name", "lname", strSurname);
		sTest.SetText("name", "emailid", strEmail);
		sTest.SetText("name", "addr", strDescription);
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

}
