package testrunnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features="C:\\Users\\msone\\eclipse-workspace\\MavenDemoCucumber\\src\\test\\java\\featurepackage", glue={"stepdefinitionpackage"},
plugin= {"pretty","html:target/HTmlreports.json"},
tags="@smoke or @regression}")


public class Test 
{
	
}

