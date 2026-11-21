package Navigation_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import LocaterManager.LocaterManager;

public class Multiple_Article_Navigation_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		LocaterManager Lm = new LocaterManager();
		
		EdgeDriver dr = new EdgeDriver();
		dr.manage().window().maximize();
		
		dr.get(Lm.getXpath("google_Url"));
		dr.navigate().to(Lm.getXpath("wikipedia_Url"));
		
		
		
		dr.findElement(By.xpath(Lm.getXpath("SearchXpath"))).sendKeys("India");
		Thread.sleep(2000);
		dr.findElement(By.xpath(Lm.getXpath("searchButtonXpath"))).click();
		
		String firstArticle = dr.findElement(By.xpath(Lm.getXpath("articletitle_Xpath"))).getText();
		if(firstArticle.toLowerCase().contains("india")) {
			System.out.println("First Article test pass");
		} else {
			System.out.println("First Article test Not pass");
			
		}
		
		dr.findElement(By.xpath(Lm.getXpath("SearchInput_in_articlePage"))).sendKeys("youtube");
		Thread.sleep(2000);
		dr.findElement(By.xpath(Lm.getXpath("SearchButton_in_articlePage"))).click();
		String secondArticle = dr.findElement(By.xpath(Lm.getXpath("articletitle_Xpath"))).getText();
		if(secondArticle.toLowerCase().contains("youtube")) {
			System.out.println("Second Article test pass");
		} else {
			System.out.println("Second Article test Not pass");
			
		}
		dr.findElement(By.xpath(Lm.getXpath("SearchInput_in_articlePage"))).sendKeys("amazon");
		Thread.sleep(2000);
		dr.findElement(By.xpath(Lm.getXpath("SearchButton_in_articlePage"))).click();
		
		String thirdArticle = dr.findElement(By.xpath(Lm.getXpath("articletitle_Xpath"))).getText();
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
