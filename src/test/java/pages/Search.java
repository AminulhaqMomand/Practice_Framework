package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Search {
    public Search(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//textarea[@name=\"q\"]")
    public WebElement searchbox;
}
