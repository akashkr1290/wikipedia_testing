package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_of_Content_Geography_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.com");
		
		dr.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("India");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		if(dr.findElement(By.xpath("//div[@id='vector-toc']")).isDisplayed()) {
			System.out.println("Table of Content Show");
			dr.findElement(By.xpath("//div[@id='vector-toc']//a[@href='#Geography']")).click();

			if (dr.getCurrentUrl().contains("#Geography")) {
				System.out.println("PASS: Geography section par page gaya");
			} else {
				System.out.println("FAIL: Geography section par page nahi gaya");
			}
		}else {
			System.out.println("Table of Content not show");
		}
	}

}
