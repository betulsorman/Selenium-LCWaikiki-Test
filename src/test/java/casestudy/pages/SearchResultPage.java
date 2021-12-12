package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchResultPage {
    public SearchResultPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "lazy-load-button")
    public WebElement moreProducts;

    @FindBy(xpath = ("(//div[@class='col-xs-6 col-sm-6 col-md-3 four-column c-item product-item-wrapper'])[3]"))
    public WebElement selectProduct;

    public void scrollEndPage() {Helper.scrollToEndPage();}

    public void seeMoreProducts() {moreProducts.click();}

    public void setSelectProduct() {selectProduct.click();}

}
