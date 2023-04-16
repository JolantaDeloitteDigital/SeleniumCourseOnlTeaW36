//package pl.coderslab.seleniumcourseonlteaw36;
//
////
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
////
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class SearchWithDuckDuckGo {
//    WebDriver driver;
//
//    @BeforeAll
//    static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }
//
////    @BeforeEach
////    void setupTest() {
////        driver = new ChromeDriver();
////    }
//
////    @AfterEach
////    void teardown() {
////        driver.quit();
////    }
//
////    public class SearchWithDuckDuckGo {
////        @Test
////        public void searchWithDuckDuckGo() {
////            WebDriver driver = new ChromeDriver();
////            driver.get("https://duckduckgo.com/");
////            WebElement searchInput = driver.findElement(By.id("search_form_input_homepage")); // .var
////            searchInput.sendKeys("W pustyni i w puszczy");
////            WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
////            searchButton.click();
////            // driver.quit();
////        }
////    }
//
//    @Test
//    public void searchWithDuckDuckGo() {
//        //WebDriver driver = new ChromeDriver();
//        driver = new ChromeDriver();
//        driver.get("https://duckduckgo.com/");
//        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage")); // .var
//        searchInput.sendKeys("W pustyni i w puszczy");
//        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
//        searchButton.click();
//        // driver.quit();
//    }
//}
//
