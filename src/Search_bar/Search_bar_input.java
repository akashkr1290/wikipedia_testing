package Search_bar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Search_bar_input {
	public static void main(String args[]) {
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
		dr.navigate().refresh();
		
		dr.findElement(By.xpath("//input[@id ='searchInput']")).sendKeys("Amazon");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
