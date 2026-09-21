package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table_of_Content_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.com");
		
		dr.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("India");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		//dr.findElement(By.xpath("//input[@id='vector-page-titlebar-toc-checkbox']")).click();
		
		if(dr.findElement(By.xpath("//div[@id='vector-toc']")).isDisplayed()) {
			System.out.println("Table of Content Show");
		}else {
			System.out.println("Table of Content not show");
		}
		

	}
}
