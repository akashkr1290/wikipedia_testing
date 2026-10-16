package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import LocaterManager.LocaterManager;

public class Article_Page_Test_2 {

	public static void main(String args[]) throws InterruptedException {
		LocaterManager Lm = new LocaterManager();
		
		EdgeDriver dr = new EdgeDriver();
		
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("Youtube");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		Thread.sleep(2000);
		if(dr.findElement(By.xpath(Lm.getXpath("youtube_Xpath"))).isDisplayed()) {
			System.out.print("test is pass ");
			dr.quit();
		}else {
			System.out.println("test is not pass");
			dr.quit();
		}
		
		
		
	}

}
