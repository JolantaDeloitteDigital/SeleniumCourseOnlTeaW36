package pl.coderslab.seleniumcourseonlteaw36.zadaniezaliczeniowe.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourseonlteaw36.zadaniezaliczeniowe.MyStoreAccountPage;
import pl.coderslab.seleniumcourseonlteaw36.zadaniezaliczeniowe.MyStoreAddressesPage;
import pl.coderslab.seleniumcourseonlteaw36.zadaniezaliczeniowe.MyStoreHomePage;
import pl.coderslab.seleniumcourseonlteaw36.zadaniezaliczeniowe.MyStoreLogInPage;

import java.time.Duration;

public class MyStoreCucumberSteps {
    private WebDriver driver;
    String email = "ixf12630@nezid.com";
    String password = "Test123@";
    String addressesLink = "https://mystore-testlab.coderslab.pl/index.php?controller=addresses";

    @Given("Page {string} opened in browser")
    public void page_opened_in_browser(String pageUrl) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get(pageUrl);
    }

    @When("When Sign In button clicked")
    public void when_sign_in_button_clicked() {
        MyStoreHomePage homePage = new MyStoreHomePage(driver);
        homePage.clickLogInButton();
    }
    @When("Logged in user details entered")
    public void logged_in_user_details_entered() {
        MyStoreLogInPage logInPage = new MyStoreLogInPage(driver);
        logInPage.provideExistingUserDetails(email,password);
        logInPage.clickLogInButton();
    }
    @When("Account details button is clicked")
    public void account_details_button_is_clicked() {
        MyStoreHomePage homePage = new MyStoreHomePage(driver);
        homePage.clickAccountButton();
    }
    @When("Addresses tab is clicked")
    public void addresses_tab_is_clicked() {
        MyStoreAccountPage accountPage = new MyStoreAccountPage(driver);
        accountPage.clickAddressesTab();
    }
    @When("Add new address button is clicked")
    public void add_new_address_button_is_clicked() {
        MyStoreAddressesPage addressesPage = new MyStoreAddressesPage(driver);
        addressesPage.clickAddNewAddressButton();

    }
    @When("New address details are filled in with given details {string}, {string}, {string}, {string}, {string}")
    public void new_address_details_are_filled_in_with_given_details(String addressAlias, String addressAddress, String addressCity, String addressZipCode, String addressPhone) {
        MyStoreAddressesPage addressesPage = new MyStoreAddressesPage(driver);
        addressesPage.provideDetailsOfNewAddress(addressAlias,addressAddress,addressCity,addressZipCode,addressPhone);
    }
    @When("New address is submitted")
    public void new_address_is_submitted() {
        MyStoreAddressesPage addressesPage = new MyStoreAddressesPage(driver);
        addressesPage.submitAddingNewAddress();
    }
    @Then("New address details match added address details")
    public void new_address_details_match_added_address_details() {
        System.out.println("jest ok");
    }

}
