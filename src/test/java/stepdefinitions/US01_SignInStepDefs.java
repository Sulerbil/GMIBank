package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AccountPage;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Set;

public class US01_SignInStepDefs {

    SignInPage signInPage = new SignInPage();
    AccountPage accountPage = new AccountPage();

    @Given("user is on the Signin page")
    public void user_is_on_the_Signin_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("signIn_url"));
    }

    @Given("user provides username {string}")
    public void user_provides_username(String username) {
        signInPage.userNameTextBox.sendKeys(username);

    }

    @Given("user provides password {string}")
    public void user_provides_password(String password) {
        signInPage.passwordTextBox.sendKeys(password);

    }

    @Given("user clicks signInButton")
    public void user_clicks_signInButton() {
        signInPage.signInButton.click();
    }

    @Then("user must be signIn")
    public void user_must_be_signIn() {
        String expectedAccountName = "Manager Team5";
        Assert.assertEquals(expectedAccountName,accountPage.userAccountName.getText());
        accountPage.userAccountName.click();
        accountPage.signOutButton.click();
    }

}
