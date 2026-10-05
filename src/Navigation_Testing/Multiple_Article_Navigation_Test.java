package Navigation_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Article_Navigation_Test {

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
		Thread.sleep(2000);
		dr.findElement(By.xpath(pr.getProperty("searchButtonXpath"))).click();
		
		String firstArticle = dr.findElement(By.xpath(pr.getProperty("articletitle_Xpath"))).getText();
		if(firstArticle.toLowerCase().contains("india")) {
			System.out.println("First Article test pass");
		} else {
			System.out.println("First Article test Not pass");
			
		}
		
		dr.findElement(By.xpath(pr.getProperty("SearchInput_in_articlePage"))).sendKeys("youtube");
		Thread.sleep(2000);
		dr.findElement(By.xpath(pr.getProperty("SearchButton_in_articlePage"))).click();
		String secondArticle = dr.findElement(By.xpath(pr.getProperty("articletitle_Xpath"))).getText();
		if(secondArticle.toLowerCase().contains("youtube")) {
			System.out.println("Second Article test pass");
		} else {
			System.out.println("Second Article test Not pass");
			
		}
		dr.findElement(By.xpath(pr.getProperty("SearchInput_in_articlePage"))).sendKeys("amazon");
		Thread.sleep(2000);
		dr.findElement(By.xpath(pr.getProperty("SearchButton_in_articlePage"))).click();
		
		String thirdArticle = dr.findElement(By.xpath(pr.getProperty("articletitle_Xpath"))).getText();
		if(thirdArticle.toLowerCase().contains("amazon")) {
			System.out.println("Third Article test pass");
		} else {
			System.out.println("Third Article test Not pass");
			
		}
		
		if(firstArticle.toLowerCase().contains("india") && secondArticle.toLowerCase().contains("youtube") && thirdArticle.toLowerCase().contains("amazon")) {
			System.out.println("Multiple Article testing is pass");
		}else {
			System.out.println("Multiple Article testing is not pass");
		}
		
		dr.quit();
		

	}

}
