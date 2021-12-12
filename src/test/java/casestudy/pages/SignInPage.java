package casestudy.pages;

import casestudy.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "LoginEmail")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(id = "loginLink")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text() = 'Hesabım']")
    public WebElement myAccount;

    @FindBy(id = "search_input")
    public WebElement searchBox;

    @FindBy(className = "searchButton")
    public WebElement searchIcon;

    public void setEmailInput(String emailAddress) {
        emailInput.click();
        emailInput.sendKeys(emailAddress);
    }

    public void setPasswordInput(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    public void setSignInButton() {
        signInButton.sendKeys(Keys.ENTER);
    }

    public void verifyMyAccount() {
        Assert.assertEquals("Hesabım", myAccount.getText());
    }

    public void searchFor(String searchKey) {
        searchBox.click();
        searchBox.sendKeys(searchKey);
        searchIcon.click();
    }


}
