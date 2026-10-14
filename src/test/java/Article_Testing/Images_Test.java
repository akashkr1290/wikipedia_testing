package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://wikipedia.org");
		
		dr.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("india");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		if((dr.findElement(By.xpath("//a[@class = 'mw-file-description' and contains(@title,'Flag')]"))).isDisplayed()) {
			
			dr.findElement(By.xpath("//a[@class = 'mw-file-description' and contains(@title,'Flag')]")).click();
			System.out.println("Image 1 is showned");
			
		}else {
			System.out.println("Image 1Not Showned ");
		}
		
		dr.navigate().back();
		Thread.sleep(2000);
		if(dr.findElement(By.xpath("//a[@class = 'mw-file-description']/img[contains(@resource,'Emblem_of_India')]")).isDisplayed()) {
			dr.findElement(By.xpath("//a[@class = 'mw-file-description']/img[contains(@resource,'Emblem_of_India')]")).click();
			System.out.println("Image 2 is showned");
		}else {
			System.out.println("Image 2 Not Showned");
		}
		
		
		dr.quit();
		
	}

}
