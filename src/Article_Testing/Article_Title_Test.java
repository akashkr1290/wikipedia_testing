package Article_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Article_Title_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
		
		try {
			dr.findElement(By.xpath("//button[@aria-label='minimize']")).click();
			dr.findElement(By.xpath("//div[@aria-label='close']")).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		dr.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("India");
		dr.findElement(By.xpath("//button[@type='submit']/child::i")).click();
		String title = dr.findElement(By.xpath("//span[@class = 'mw-page-title-main']")).getText();
		System.out.println("Article Title : "+title);
		if(title.equals("India")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("test Fail");
		}
				

	}

}
