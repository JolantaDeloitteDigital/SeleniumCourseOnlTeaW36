package pl.coderslab.seleniumcourseonlteaw36.pageobjectddg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchWithDuckDuckGoTest {
    private WebDriver driver;
    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://duckduckgo.com/");
    }

    @AfterEach
    public void afterAll(){
       this.driver.quit();
    }

    @Test
    public void searchWithDuckDuckGoAndVerifyResults() {
        // Land on HP and search for phrase
        String phraseToSearch = "W pustyni i w puszczy";
        SearchWithDDGPage searchDDGPage = new SearchWithDDGPage(driver);
        searchDDGPage.enterSearchingPhrase(phraseToSearch);
        searchDDGPage.clickSearchButton();
        // Verify search results
        ResultsInDDGPage searchResultsDDG = new ResultsInDDGPage(driver);
        searchResultsDDG.getFirstXResults(5);
        double allowedBadPercentage = 40;
        double actualBadPercentage = searchResultsDDG.verifySEOEffectiveness(phraseToSearch);
        assertTrue( actualBadPercentage >= allowedBadPercentage, "Allowed: "+ allowedBadPercentage + " Actual: " + actualBadPercentage );
        //assertTrue(searchResultsDDG.verifySearchResults(phraseToSearch), "Not good first results");
    }
}