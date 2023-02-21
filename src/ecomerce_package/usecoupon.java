package ecomerce_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usecoupon 
{
public static void main(String as[]) throws Throwable
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://live.techpanda.org/index.php");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.linkText("MOBILE")).click();
	
	
	Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("GURU50");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	
	Thread.sleep(3000);
	String cell1=driver.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tbody/tr[1]/td[1]")).getText();
	String cell2=driver.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tbody/tr[1]/td[2]")).getText();
	String cell3=driver.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tbody/tr[2]/td[1]")).getText();
	String cell4=driver.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]")).getText();
	System.out.println(cell1+"   "+cell2);
	System.out.println(cell3+"   "+cell4);
	Thread.sleep(2000);
	driver.close();
}
}
