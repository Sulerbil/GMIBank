package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.SignInPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;


public class US03_SignInNegativeExamples {

    SignInPage signInPage = new SignInPage();
    SoftAssert softAssert = new SoftAssert();

    @Then("user gets an error message")
    public void user_gets_an_error_message() {

        String expectedFailMessage = "Failed to sign in!";

        Driver.wait(5);
        softAssert.assertTrue(signInPage.failMessage.isDisplayed());

        System.out.println(signInPage.failMessage.getText());

        softAssert.assertTrue(signInPage.failMessage.getText().contains(expectedFailMessage));

        softAssert.assertAll();
    }
}
