package Article_Page_Open;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import LocaterManager.LocaterManager;

public class Search_Java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocaterManager lm = new LocaterManager();
		
		ChromeDriver dr = new ChromeDriver();
		dr.get(lm.getXpath("google_Url"));
		dr.navigate().to(lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(lm.getXpath("SearchXpath"))).sendKeys("Java");;
		dr.findElement(By.xpath(lm.getXpath("searchButtonXpath"))).click();
		
		Thread.sleep(2000);
		if(dr.findElement(By.xpath(lm.getXpath("articletitle_Xpath"))).isDisplayed()) {
			System.out.print("test is pass ");
			dr.quit();
		}else {
			System.out.println("test is not pass");
			dr.quit();
		}
		
	}

}
