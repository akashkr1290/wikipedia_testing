package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;
public class References_test {
	public static void main(String args[]) {
		
		LocaterManager Lm = new LocaterManager();
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		dr.findElement(By.xpath(Lm.getXpath("Reference_Xpath"))).click();
		dr.findElement(By.xpath(Lm.getXpath("Reference_link_Xpath"))).click();
		
		if(dr.findElement(By.xpath(Lm.getXpath("National_Informatics_Centre_isDisplay"))).isDisplayed()) {
			System.out.println("Is Displayed ");
			
		}else {
			System.out.println("Not Display");
		}
		dr.quit();
	}

}
