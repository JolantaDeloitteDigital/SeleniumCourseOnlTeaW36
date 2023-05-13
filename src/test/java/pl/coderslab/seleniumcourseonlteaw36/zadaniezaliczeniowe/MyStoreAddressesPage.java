package pl.coderslab.seleniumcourseonlteaw36.zadaniezaliczeniowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAddressesPage {
    @FindBy(css = "a[data-link-action='add-address']")
    private WebElement addNewAddress;
    @FindBy(css = "#field-alias")
    private WebElement addressAlias;
    @FindBy(css = "#field-address1")
    private WebElement addressAddress;
    @FindBy(css = "#field-city")
    private WebElement addressCity;
    @FindBy(css = "#field-postcode")
    private WebElement addressZipCode;
    @FindBy(css = "#field-phone")
    private WebElement addressPhone;
    @FindBy(css = "#input[name='submitAddress'] + button")
    private WebElement addressSubmit;


    public MyStoreAddressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddNewAddressButton() {
        addNewAddress.click();
    }

    public void provideDetailsOfNewAddress(String alias, String address, String city, String zipCode, String phone) {
        addressAlias.sendKeys(alias);
        addressAddress.sendKeys(address);
        addressCity.sendKeys(city);
        addressZipCode.sendKeys(zipCode);
        addressPhone.sendKeys(phone);
    }

    public void submitAddingNewAddress() {
        addressSubmit.click();
    }
}
