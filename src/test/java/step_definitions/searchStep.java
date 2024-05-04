package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Search;
import utilities.Driver;

public class searchStep {
    Search search=new Search();
    @When("type book")
    public void typeBook() {
        search.searchbox.sendKeys("book");
    }

    @Then("see the book")
    public void seeTheBook() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("book") );
    }
}
