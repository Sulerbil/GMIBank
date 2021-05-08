package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
        @FindBy(xpath = "//li[@id='account-menu']")
                public WebElement accountMenu;

        @FindBy(xpath = "//span[text()='Sign in']")
                public  WebElement signinButton;

        @FindBy(xpath = "//span[text()='Register']")
               public WebElement registerButton;

}
