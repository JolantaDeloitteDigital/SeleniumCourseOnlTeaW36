package pl.coderslab.seleniumcourseonlteaw36.pageobjectddg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsInDDGPage {

    private final WebDriver driver;

    public ResultsInDDGPage (WebDriver driver) {
        this.driver = driver;
    }

    public List<String> firstResultsList = new ArrayList();
    public List<String> getFirstXResults(int searchScale) {
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div#links article h2 a span"));
        for(int i = 0; i < searchScale; i++) {
            WebElement oneSearchResult = searchResults.get(i);
            String text = oneSearchResult.getText();
            firstResultsList.add(text);
        }
        return firstResultsList;
    }
    public boolean verifySearchResults(String phrase){
        for (String result : firstResultsList) {
            if (!result.contains(phrase)) {
                return false;
            }
        }
        return true;
    }

    public double verifySEOEffectiveness(String phrase){
        double goodSearch = 1;
        double badSearch = 1;
        for (String result : firstResultsList) {
            if (result.contains(phrase)) {
                goodSearch++;
            } else {
                badSearch++;
            }
        }
        double result = (badSearch / goodSearch)*100;
        return result;
    }
}
