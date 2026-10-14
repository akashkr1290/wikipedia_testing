package Search_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valid_keyword_India {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver dr = new ChromeDriver();

	        dr.get("https://www.wikipedia.org");

	        dr.findElement(By.id("searchInput")).sendKeys("India");

	        dr.findElement(By.xpath("//button[@type='submit']")).click();

	        if (dr.getTitle().contains("India")) {
	            System.out.println("India Search Result is Displaying.");
	            System.out.println("TEST PASSED");
	        } else {
	            System.out.println("India Search Result is not Displaying.");
	            System.out.println("TEST FAILED");
	        }

	        dr.quit();

	}

}
