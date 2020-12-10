package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtoCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faiys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.bestbuy.ca/en-ca/product/google-nest-mini-2nd-gen-smart-speaker-charcoal/13962884"); 
		
		driver.findElement(By.className("button_2Xgu4")).click();
		
		}
	}