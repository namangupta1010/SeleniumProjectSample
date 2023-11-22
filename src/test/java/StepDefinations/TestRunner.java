package StepDefinations;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src\\test\\resources\\Features",
        glue={"StepDefinations"},
monochrome = true,
        plugin = {"pretty","html:target/reports/report.html",
                "json:target/reports/cucumber.json",
                "json:target/reports/cucumber.xml"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {


    }

