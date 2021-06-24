
package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/feature/contactUs.feature",
		glue = {"stepDefinition"}
		, tags= {"@test3"}
		)


public class Runner {

}

//Points to be noted:
//
//In Runner File
//	if there is an error in "Cucumber.class" press "ctrl+shift+o(not zero)"
//
//In step Definition file
//	if passing data via Scenario pass values using <"String">
//	if passing data via Scenario Outline pass values using <value> and use examples as below
//	
//	Examples:
//		|value|
//		|edwin|