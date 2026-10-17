package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;

public class Internal_Link_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LocaterManager Lm = new LocaterManager();
		ChromeDriver dr = new ChromeDriver();
		
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath(Lm.getXpath("Internal_South_Asia_Xpath"))).click();
		
		System.out.println("Internal link working");
		dr.quit();
		
		

	}

}
