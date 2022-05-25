package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class defaultPage {

    public defaultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id = "")
    public WebElement id;

}
