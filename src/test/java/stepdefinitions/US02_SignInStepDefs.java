package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.AccountPage;
import pages.SignInPage;
import utilities.Driver;


public class US02_SignInStepDefs {

    SignInPage signInPage = new SignInPage();
    AccountPage accountPage = new AccountPage();

    @Given("user provides wrong username {string}")
    public void user_provides_wrong_username(String username) {
        signInPage.userNameTextBox.sendKeys(username);
    }

    @Given("user provides correct password {string}")
    public void user_provides_correct_password(String password) {
        signInPage.passwordTextBox.sendKeys(password);
    }

    @Given("user will click signInButton")
    public void user_will_click_signInButton() {
        signInPage.signInButton.click();
    }

    @Then("user get an error message")
    public void user_get_an_error_message() {
        String expectedMessage = "Failed to sign in!";

        if(accountPage.userAccountName.isDisplayed()){
            accountPage.userAccountName.click();
            accountPage.signOutButton.click();
        }
        Assert.assertTrue(signInPage.failMessage.getText().contains(expectedMessage));

    }

    @Given("user provides correct username {string}")
    public void user_provides_correct_username(String username) {
        signInPage.userNameTextBox.sendKeys(username);

    }

    @Given("user provides wrong password {string}")
    public void user_provides_wrong_password(String password) {
        signInPage.passwordTextBox.sendKeys(password);

    }
}
