package Navigation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Button_Test {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
		
		dr.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("India");
		dr.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		String title = dr.findElement(By.xpath("//span[@class = 'mw-page-title-main']/parent::span/parent::h1")).getText();
		
		dr.findElement(By.xpath("//input[@aria-label = 'Search Wikipedia'  and @title='Search Wikipedia [alt-f]']")).sendKeys("Youtube");
		dr.findElement(By.xpath("//button[text()='Search']")).click();
		dr.navigate().back();
		Thread.sleep(1000);
		String title2 = dr.findElement(By.xpath("//span[@class = 'mw-page-title-main']/parent::span/parent::h1")).getText();
		
		if(title.equals(title2)) {
			System.out.println("Title is same, Back-button work perfectly");
		}else {
			System.out.println("Title is not same, Back-button not work perfectly");
		}
		
		dr.quit();
	}

}
