package step_definitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class parrallelStep {
    @When("user verfy second google page")
    public void userVerfySecondGooglePage() {
        Assert.assertTrue( Driver.getDriver().getTitle().contains("google"));
    }
}
