package StepDef;


import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	  WebDriver driver = null;
	  /*
	 @Test
	  public void browser_is_open() {

		//Code.AutomatedQA.testcomplete.UnitTesting.AddClasses(new Class[]{MyTestClass.class});
			System.out.println("Inside ste Browser is open");
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
	        
	        // Instantiate a ChromeDriver class.     
	    driver=new ChromeDriver();  
	     
	      // Launch Website  
	 //  driver.navigate().to(sUrl);
			driver.manage().window().maximize();
		//	GoogleSearchSteps test = new GoogleSearchSteps();
			//test.user_is_on_google_search_box1();
			
			System.out.println("Inside step, User is on google page");
			driver.navigate().to("https://www.google.com/search");
			System.out.println("Inside step usr Enters text");
			driver.findElement(By.name("q")).sendKeys("Laptop"+ Keys.TAB);
			System.out.println("Inside step Hit ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			//test.user_enters_text_a_text_search_box();
			//test.user_is_navigated_to_search_results();
			String ActualTitle = driver.getTitle();
String ExpectedTitle = "Laptop - Google Search";
Assert.assertEquals(ExpectedTitle, ActualTitle);
           }
           */
}
