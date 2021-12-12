package casestudy.step_def;

import casestudy.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitions {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();


    @Then("I verify opening homepage")
    public void iVerifyOpeningHomepage() {homePage.verifyTitle();}

    @Then("I open signIn dropdown menu")
    public void iOpenDropdownMenu() {homePage.setLoginButton();}

    @Then("I click signIn dropdown menu")
    public void iClickSignInDropdownMenu() {homePage.setLoginPageText();}

    @When("fill login form for email {string}")
    public void fillLoginFormForEmail(String emailAddress) {signInPage.setEmailInput(emailAddress);}

    @When("fill login form for password {string}")
    public void fillLoginFormForPassword(String password) {signInPage.setPasswordInput(password);}

    @Then("sign in button clicked")
    public void signInButtonClicked() {signInPage.setSignInButton();}

    @Then("verify successful login")
    public void verifySuccessfulLogin() {signInPage.verifyMyAccount();}

    @When("I search for {string}")
    public void iSearchFor(String searchKey) {signInPage.searchFor(searchKey);}

    @And("scroll end page")
    public void scrollEndPage() {searchResultPage.scrollEndPage();}

    @And("see more products")
    public void seeMoreProducts() {searchResultPage.seeMoreProducts();}

    @And("select random product")
    public void selectRandomProduct() {searchResultPage.setSelectProduct();}

    @And("select size of product")
    public void selectSizeOfProduct() {productPage.setSize();}

    @And("product to cart")
    public void productToCart() {productPage.setAddToCartButton();}

    @And("click my cart")
    public void clickMyCart() {homePage.setMyCart();}

    @And("price in the product page")
    public void priceInTheProductPage() {productPage.setPriceInProductPage();}

    @Then("compare the price in the basket with the price on the product page")
    public void compareThePriceInTheBasketWithThePriceOnTheProductPage() {cartPage.comparePrice();}

    @And("increase product")
    public void increaseProduct() {cartPage.setIncreaseProduct();}

    @Then("verify increasing product")
    public void verifyIncreasingProduct() {cartPage.setVerifyIncreaseProduct();}

    @And("decrease product")
    public void decreaseProduct() {cartPage.setDecreaseProduct();}

    @Then("verify decreasing product")
    public void verifyDecreasingProduct() {cartPage.setVerifyDecreaseProduct();}
}
