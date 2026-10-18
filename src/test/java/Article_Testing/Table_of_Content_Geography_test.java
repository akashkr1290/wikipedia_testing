package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;

public class Table_of_Content_Geography_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		LocaterManager Lm = new LocaterManager();
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		
		if(dr.findElement(By.xpath(Lm.getXpath("TOC_Xpath"))).isDisplayed()) {
			System.out.println("Table of Content Show");
			Thread.sleep(2000);
			dr.findElement(By.xpath(Lm.getXpath("Geography_Toc_Xpath"))).click();

			if (dr.getCurrentUrl().contains("#Geography")) {
				System.out.println("PASS: Geography section par page gaya");
			} else {
				System.out.println("FAIL: Geography section par page nahi gaya");
			}
		}else {
			System.out.println("Table of Content not show");
		}
		
		dr.quit();
	}

}
