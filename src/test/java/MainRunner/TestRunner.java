package MainRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)

@CucumberOptions(features= {"src\\test\\resources\\Features"},glue= {"src\\testjava\\MainRunner"},
		//adding double Feature package
//@CucumberOptions(features= {"src\\test\\java\\Features"},
	

plugin = {"pretty"})

public class TestRunner {

}
