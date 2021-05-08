package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountPage {

    public AccountPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[text()='Manager Team5']")
    public WebElement userAccountName;

    @FindBy(xpath = "//span[text() = 'Sign out'];")
    public WebElement signOutButton;

    @FindBy(xpath = "//a[text()='Withdraw']")
    public WebElement withdraw;

    @FindBy(xpath = "//a[text()='Send Money']" )
    public WebElement sendMoney;

    @FindBy(xpath = "//a[text()='Cards']" )
    public WebElement cards;

    @FindBy(xpath = "//a[text()='Exchange']" )
    public WebElement exchange;

    @FindBy(xpath = "//a[text()='Learn More']")
    public WebElement learnMore;

    @FindBy(xpath = "//a[text()='Online Business']")
    public WebElement onlineBusiness;

    @FindBy(xpath = "//a[text()='Business Plan']")
    public WebElement businessPlan;

    @FindBy(xpath = "//a[text()='Mobile Bank']")
    public WebElement mobileBank;




}
