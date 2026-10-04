package Navigation_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_Button_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties pr = new Properties();
		FileInputStream fs = new FileInputStream("E:\\PROJECT\\wikipedia_testing\\Xpath.properties");
		pr.load(fs);
		Thread.sleep(2000);
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get(pr.getProperty("google_Url"));
		dr.navigate().to(pr.getProperty("wikipedia_Url"));
		
		dr.findElement(By.xpath(pr.getProperty("SearchXpath"))).sendKeys("India");
		dr.findElement(By.xpath(pr.getProperty("searchButtonXpath"))).click();
		
		String title = dr.findElement(By.xpath(pr.getProperty("articlTtitle_Xpath"))).getText();
		
		dr.navigate().refresh();
		Thread.sleep(2000);
		String title2 = dr.findElement(By.xpath(pr.getProperty("articlTtitle_Xpath"))).getText();
		
		if(title.equals(title2)) {
			System.out.println("Refresh button work properly");
		}else {
			System.out.println("Refresh button Not work properly");
		}
		
		dr.quit();
		

	}

}
