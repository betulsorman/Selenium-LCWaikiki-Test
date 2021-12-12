package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@href ='https://www.lcwaikiki.com/tr-TR/TR/giris']")
    public WebElement loginButton;

    @FindBy(className = "ul-title")
    public WebElement loginPageText;

    @FindBy(className = ("header-cart"))
    public WebElement myCart;

    public void verifyTitle() {
        Helper.switchLastTab();
        Assert.assertTrue("LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki".equals(Driver.get().getTitle()) ||
                "LC Waikiki - Online Alışveriş Sitesi, Moda Senin Seçimin - LC Waikiki".equals(Driver.get().getTitle()));
    }

    public void setLoginButton() {
        loginButton.click();
    }

    public void setLoginPageText() {
        Helper.waitUntilVisible(loginPageText);
    }

    public void setMyCart() {
        myCart.click();
    }
}

