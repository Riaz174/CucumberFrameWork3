package RunnerC;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/FeatureC/Contact.Feature"},glue= {"StepDefinitionC"},monochrome= true,tags = {"@tag1"}) 


public class RunC {

}
