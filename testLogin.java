package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faiys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.bestbuy.ca"); 
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.className("signInOutNavContainer_1_MBd")).click();
		
		driver.findElement(By.id("username")).sendKeys("faiysal96@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("welcome1");
		
		driver.findElement(By.className("_2tmy0")).click();
		
		}
	}