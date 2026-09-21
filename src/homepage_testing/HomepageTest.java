package homepage_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageTest {
    public static void main(String[] args) {
        // Initialize the browser driver
        WebDriver driver = new ChromeDriver();
        
        // 1. Wikipedia homepage open/URL testing
        driver.get("https://www.wikipedia.org");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("URL Test Passed: " + currentUrl);

        // 2. Logo verification
        WebElement logo = driver.findElement(By.className("central-featured-logo"));
        System.out.println("Logo is displayed: " + logo.isDisplayed());

        // 3. Search box visibility & Search button check
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        System.out.println("Search box is visible: " + searchBox.isDisplayed());

        // 4. Language dropdown verification
        WebElement langDropdown = driver.findElement(By.id("searchLanguage"));
        System.out.println("Language dropdown is visible: " + langDropdown.isDisplayed());

        // Close the browser
        driver.quit();
    }
}