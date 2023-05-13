package pl.coderslab.seleniumcourseonlteaw36.zadaniezaliczeniowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreHomePage {
    @FindBy(css = ".user-info a[href='https://mystore-testlab.coderslab.pl/index.php?controller=my-account']")
    private WebElement signInButton;
    @FindBy(css = ".account")
    private WebElement accountInfo;

    public MyStoreHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLogInButton() {
        signInButton.click();
    }
    public void clickAccountButton() {
        accountInfo.click();
    }
}
