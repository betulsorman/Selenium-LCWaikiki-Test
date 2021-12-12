package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = ("(//div[@class='option-size'])[1]"))
    public WebElement size;

    @FindBy(id = "pd_add_to_cart")
    public WebElement addToCartButton;

    @FindBy(xpath = ("(//span[@class='price'])[3]"))
    public WebElement priceInProductPage;

    private static String productPrice;

    public void setAddToCartButton() {addToCartButton.click();}

    public void setSize() {size.click();}

    public void setPriceInProductPage() {
        productPrice = priceInProductPage.getText();
    }

    public static String getProductPrice(){
        return productPrice;
    }



}
