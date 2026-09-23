package Navigation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeNavigationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
		
		if(dr.findElement(By.xpath("//body[@id='www-wikipedia-org']")).isDisplayed()) {
			System.out.println("Home Page is Displaying");
			
		}
		else {
			System.out.println("Home Page is not Displaying.");
		}
		
		if(dr.findElement(By.xpath("//input[@id='searchInput']")).isDisplayed()) {
			System.out.println("Search bar is Displayed.");
		}else {
			System.out.println("Serach bar is not Displaying");
		}
		
		if(dr.findElement(By.xpath("//button[@type='submit']")).isDisplayed()) {
			System.out.println("Search Button is Displaying.");
		}else {
			System.out.println("Search Button is not Displaying.");
		}
		
		dr.quit();

	}

}
