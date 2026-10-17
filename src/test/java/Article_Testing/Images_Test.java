package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;

public class Images_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LocaterManager Lm = new LocaterManager();
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("india");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		Thread.sleep(2000);
		if((dr.findElement(By.xpath(Lm.getXpath("Flag_Image_Xpath")))).isDisplayed()) {
			
			dr.findElement(By.xpath(Lm.getXpath("Flag_Image_Xpath"))).click();
			System.out.println("Image 1 is showned");
			
		}else {
			System.out.println("Image 1Not Showned ");
		}
		
		dr.navigate().back();
		Thread.sleep(2000);
		if(dr.findElement(By.xpath(Lm.getXpath("EOF_image_Xpath"))).isDisplayed()) {
			dr.findElement(By.xpath(Lm.getXpath("EOF_image_Xpath"))).click();
			System.out.println("Image 2 is showned");
		}else {
			System.out.println("Image 2 Not Showned");
		}
		
		
		dr.quit();
		
	}

}
