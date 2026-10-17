package Article_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;
public class External_Links_test {

	public static void main(String args[]) throws InterruptedException {
		LocaterManager Lm = new LocaterManager();
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath(Lm.getXpath("External_Link"))).click();
		
		System.out.println("External Link Test Pass");
		dr.quit();
		
	}
}
