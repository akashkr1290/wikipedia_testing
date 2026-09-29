
package Search_Functionality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 public static void main(String[] args) {

		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.wikipedia.org/");

		        driver.manage().window().maximize();

		        WebElement searchBox = driver.findElement(By.id("searchInput"));
		        searchBox.sendKeys("xyzabc123");

		        driver.findElement(By.cssSelector("button[type='submit']")).click();

		        String title = driver.getTitle();

		        if (title.contains("Search results")) {
		            System.out.println("Test Passed: Search page opened.");

	}

}
