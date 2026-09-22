package Article_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class External_Links_test {

	public static void main(String args[]) {
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
		
		dr.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("India");
		dr.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		dr.findElement(By.xpath("//a[@href='#External_links']/child::div/child::span[2]")).click();
		
		System.out.println("External Link Test Pass");
		dr.quit();
		
	}
}
