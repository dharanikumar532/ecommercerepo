package cleartrip_package;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

import junit.framework.Assert;

public class login
{
	public static void main(String ad[]) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/?");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='From']")).click();
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath("//input[@id='a_FromSector_show']"));
		element.sendKeys("Mumbai");
	    Thread.sleep(4000);
	    element.sendKeys(Keys.ARROW_DOWN);
	 Thread.sleep(2000);
	 element.sendKeys(Keys.ENTER);
	 
	}
}
