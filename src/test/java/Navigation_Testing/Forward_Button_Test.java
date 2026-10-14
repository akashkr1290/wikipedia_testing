package Navigation_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forward_Button_Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// TODO Auto-generated method stub
		
		Properties pr = new Properties();
		FileInputStream  fs = new FileInputStream("E:\\PROJECT\\wikipedia_testing\\Xpath.properties");
		
		pr.load(fs);
		Thread.sleep(2000);
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get(pr.getProperty("google_Url"));
		dr.navigate().to(pr.getProperty("wikipedia_Url"));
		
		dr.findElement(By.xpath(pr.getProperty("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(pr.getProperty("searchButtonXpath"))).click();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath(pr.getProperty("SearchInput_in_articlePage"))).sendKeys("Youtube");
		dr.findElement(By.xpath(pr.getProperty("SearchButton_in_articlePage"))).click();
		Thread.sleep(2000);
		String title = dr.findElement(By.xpath(pr.getProperty("articlTtitle_Xpath"))).getText();
		dr.navigate().back();
		Thread.sleep(2000);
		
		dr.navigate().forward();
		Thread.sleep(2000);
		String title2 = dr.findElement(By.xpath(pr.getProperty("articlTtitle_Xpath"))).getText();
		
		if(title.equals(title2)) {
			System.out.println("Forward Button work correctly");
		}else {
			System.out.println("Forward Button not Work Correctly");
		}
		
		dr.quit();
	}

}
