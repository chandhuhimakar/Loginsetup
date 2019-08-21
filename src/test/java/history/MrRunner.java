package history;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="MyFeatures",glue="history",plugin= {"json:target/cucuber.json"})

public class MrRunner {
	

}
