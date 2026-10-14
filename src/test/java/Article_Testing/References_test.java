package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class References_test {
	public static void main(String args[]) {
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
		
		dr.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("India");
		dr.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		dr.findElement(By.xpath("//a[@href = '#References']/child::div/child::span[2]")).click();
		dr.findElement(By.xpath("//a[@id = 'mwFDg']/parent::span")).click();
		
		if(dr.findElement(By.xpath("//li[contains(., 'National Informatics Centre')]")).isDisplayed()) {
			System.out.println("Is Displayed ");
			
		}else {
			System.out.println("Not Display");
		}
		dr.quit();
	}

}
