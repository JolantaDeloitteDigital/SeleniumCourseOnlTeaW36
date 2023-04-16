package pl.coderslab.seleniumcourseonlteaw36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWithDuckDuckGo {
    @Test
    public void searchWithDuckDuckGo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.id("searchbox_input")); // .var
        searchInput.sendKeys("W pustyni i w puszczy");
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
        // driver.quit();
    }
}