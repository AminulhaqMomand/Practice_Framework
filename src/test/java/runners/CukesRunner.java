package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "C:\\Users\\aminu\\IdeaProjects\\Practice_Framework\\src\\test\\resources\\features",
        glue = "src/test/java/step_definitions",
        dryRun = true,
        tags = "",
        publish = true //generating a report with public link
)
public class CukesRunner {}


