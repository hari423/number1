package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\servers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.id("eLoginNew")).sendKeys("aharikrishna93@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("9908161191423");
	    driver.findElement(By.xpath("//button[@type='submit' and @value='Login']")).click();
		driver.quit();
		driver.close();
		
	}

}
