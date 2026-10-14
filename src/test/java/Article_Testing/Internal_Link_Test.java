package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Internal_Link_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.com");
		
		dr.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("India");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		dr.findElement(By.xpath("//a[@id = 'mwmQ']")).click();
		
		
		dr.quit();
		
		

	}

}
