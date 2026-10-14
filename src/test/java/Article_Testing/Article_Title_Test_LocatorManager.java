package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import LocaterManager.LocaterManager;

public class Article_Title_Test_LocatorManager {
	public static void main(String args[]) {
		
		LocaterManager Lm = new LocaterManager();
		EdgeDriver ed = new EdgeDriver();
		
		ed.get(Lm.getXpath("google_Url"));
		ed.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		try {
			ed.findElement(By.xpath("//button[@aria-label='minimize']")).click();
			ed.findElement(By.xpath("//div[@aria-label='close']")).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		ed.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("Youtube");
		ed.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		
	}

}
