package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\servers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://irctc.co.in");
	driver.findElement(By.id("usernameId")).sendKeys("Ahari423");
	driver.findElement(By.className("loginPassword")).sendKeys("Krishna423");
	String capture=driver.findElement(By.id("nlpCaptchaImg")).getText();
	System.out.println(capture);
	driver.findElement(By.id("loginbutton")).click();

	}

}
