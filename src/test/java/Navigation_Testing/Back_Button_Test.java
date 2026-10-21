package Navigation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;

public class Back_Button_Test {
	public static void main(String args[]) throws InterruptedException {
		
		LocaterManager Lm = new LocaterManager();
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		String title = dr.findElement(By.xpath(Lm.getXpath("MainArticle_Xpath"))).getText();
		
		dr.findElement(By.xpath(Lm.getXpath("wikipediaSearch_Xpath"))).sendKeys("Youtube");
		dr.findElement(By.xpath(Lm.getXpath("wikipediaSearchButton_Xpath"))).click();
		dr.navigate().back();
		Thread.sleep(2000);
		String title2 = dr.findElement(By.xpath(Lm.getXpath("MainArticle_Xpath"))).getText();
		
		if(title.equals(title2)) {
			System.out.println("Title is same, Back-button work perfectly");
		}else {
			System.out.println("Title is not same, Back-button not work perfectly");
		}
		
		dr.quit();
	}

}
