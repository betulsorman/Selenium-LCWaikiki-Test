package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".rd-cart-item-price.mb-15")
    public WebElement priceInCart;

    @FindBy(css = ".oq-up.plus")
    public WebElement increaseProduct;

    @FindBy(xpath = "//input[@value='2']")
    public WebElement numberOfProduct;

    @FindBy(xpath = "//a[@class='cart-square-link']")
    public WebElement deleteProduct;

    @FindBy(css = ".inverted-modal-button.sc-delete.ins-init-condition-tracking")
    public WebElement delete;

    @FindBy(className = "cart-empty-title")
    public WebElement cartIsEmpty;


    public void comparePrice() {
        Assert.assertEquals( ProductPage.getProductPrice(), priceInCart.getText());
    }

    public void setIncreaseProduct() {increaseProduct.click();}

    public void setVerifyIncreaseProduct() {
        Assert.assertEquals("2",numberOfProduct.getAttribute("value"));}

    public void setDecreaseProduct() {
        deleteProduct.click();
        Helper.waitUntilVisible(delete);
        delete.click();
    }

    public void setVerifyDecreaseProduct() {
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.",cartIsEmpty.getText());}


}
