package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\servers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		WebElement date=driver.findElement(By.id("day"));
		Select sel=new Select(date);
		sel.selectByVisibleText("25");
		String talen=sel.getFirstSelectedOption().getText();
		System.out.println(talen);
		driver.close();
	}

}
