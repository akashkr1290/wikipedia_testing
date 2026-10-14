package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Article_Page_Test {
	public static void main(String args[]) {
		
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
		
		try {
			dr.findElement(By.xpath("//button[@aria-label='minimize']")).click();
			dr.findElement(By.xpath("//div[@aria-label='close']")).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		dr.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("Youtube");
		dr.findElement(By.xpath("//button[@type='submit']/child::i")).click();
		
	}
}
