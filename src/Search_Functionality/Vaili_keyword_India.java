package Search_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vaili_keyword_India {

    public static void main(String[] args) {

        ChromeDriver dr = new ChromeDriver();

        dr.get("https://www.wikipedia.org");

        if (dr.findElement(By.xpath("//input[@id='searchInput']")).isDisplayed()) {
            System.out.println("Search bar is Displayed.");
        } else {
            System.out.println("Search bar is not Displaying.");
        }
       
        }

        dr.quit();
    }
}