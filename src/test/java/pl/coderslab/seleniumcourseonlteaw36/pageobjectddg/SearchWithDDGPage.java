package pl.coderslab.seleniumcourseonlteaw36.pageobjectddg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchWithDDGPage {
    private final WebDriver driver;

    public SearchWithDDGPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchingPhrase(String searchingPhrase) {
        WebElement searchInput = driver.findElement(By.id("searchbox_input")); // .var
        searchInput.sendKeys(searchingPhrase);
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.cssSelector(".searchbox_searchButton__F5Bwq"));
        searchButton.click();
    }
}
