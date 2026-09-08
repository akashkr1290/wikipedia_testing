package Search_bar;

import org.openqa.selenium.chrome.ChromeDriver;
public class Search_bar_input {
	public static void main(String args[]) {
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.wikipedia.org");
	}

}
