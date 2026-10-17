package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import LocaterManager.LocaterManager;

public class Article_Title_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		String title = dr.findElement(By.xpath(Lm.getXpath("articletitle_Xpath"))).getText();
		System.out.println("Article Title : "+title);
		if(title.equals("India")) {
			System.out.println("Test Pass");
			dr.quit();
		}else {
			System.out.println("test Fail");
			dr.quit();
		}
				
	}

}