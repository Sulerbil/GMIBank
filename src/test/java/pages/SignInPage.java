package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {

    public SignInPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//input[@id='username']")
                public WebElement userNameTextBox;

        @FindBy(xpath = "//input[@id='password']")
                public WebElement passwordTextBox;

        @FindBy(xpath = "//span[text()='Did you forget your password?']")
               public WebElement forgetPasswordButton;

        @FindBy(xpath = "//span[text()='Register a new account']")
               public WebElement registerLink;

        @FindBy(xpath = "//span[text()='Cancel']")
              public WebElement cancelButton;

        @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
              public WebElement signInButton;

        @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
              public WebElement failMessage;


}
