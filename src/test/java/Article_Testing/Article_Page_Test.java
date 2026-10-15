package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;

public class Article_Page_Test {
	public static void main(String args[]) {
		
		LocaterManager Lm = new LocaterManager();
		
		ChromeDriver dr = new ChromeDriver();
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		try {
			dr.findElement(By.xpath("//button[@aria-label='minimize']")).click();
			dr.findElement(By.xpath("//div[@aria-label='close']")).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("Youtube");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		System.out.println("Test is Pass");
		
		dr.quit();
		
	}
}
