package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Guruu {
@Test
	public void Test1() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\servers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://live.guru99.com/index.php/");
		String title=driver.getTitle();
		String in="Home page";
		Assert.assertEquals(title, in);
		driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html'and text()='Mobile']")).click();
		String realmobiletile=driver.getTitle();
		String expectedmobile="Mobile";
		Assert.assertEquals(realmobiletile, expectedmobile);
		WebElement dropdown=driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Name");

	}

}
