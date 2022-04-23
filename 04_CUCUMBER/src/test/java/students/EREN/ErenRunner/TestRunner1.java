package src.test.java.students.EREN.ErenRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "src/test/java/CucumberHomeWork", // this is for feature files path
        glue = "CucumberHomeWork/StepDefinitionsHW", // this is for Steps
        tags = "TC10",
        dryRun = true,  // when it is true , it will check if there is any undefined steps.
        plugin={"pretty","html:target/default-cucumber-reports.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"}



        )








public class TestRunner1 {


}
