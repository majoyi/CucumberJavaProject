package MainRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/Features"},
glue= {"StepDefination"},
plugin = {"pretty", "html:target/cucumber-html-report"})
		//adding double Feature package
//@CucumberOptions(features= {"src\\test\\java\\Features"},
	



public class TestRunner {

}
