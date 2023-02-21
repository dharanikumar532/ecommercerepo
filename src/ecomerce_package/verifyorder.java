package ecomerce_package;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyorder {

	public static void main(String[] args)throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.techpanda.org/index.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[text()='Account'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumardharani454@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("y93155153");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("MY ORDERS")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='View Order'])[1]")).click();
		Thread.sleep(2000);
		String title=driver.findElement(By.xpath("//div[@class='page-title title-buttons']//h1")).getText();
		System.out.println("status is    "+title);
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		driver.findElement(By.linkText("Print Order")).click();
		Thread.sleep(5000);

		Set<String> allitems1=driver.getWindowHandles();
		System.out.println("no of windows are   "+allitems1.size());
		ArrayList<String> allitems=new ArrayList<>(allitems1);
	
			driver.switchTo().window(allitems.get(2));
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(allitems.get(0));
			System.out.println(driver.getTitle());
			driver.close();
		
	}

}


