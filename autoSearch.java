package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faiys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.bestbuy.ca"); 
		
		driver.findElement(By.name("search")).sendKeys("headphones");
		
		driver.findElement(By.className("searchButton_T4-BG")).click(); 
		
		System.out.println("Successful");
		
	}
}
