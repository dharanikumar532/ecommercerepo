package ecomerce_package;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class wishlist
{
	public static void main(String as[])throws Throwable
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
		driver.findElement(By.linkText("MOBILE")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='link-wishlist'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='cart-cell'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(2000);
		Select element=new Select(driver.findElement(By.id("billing-address-select")));
		element.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='billing[firstname]']")).clear();
		driver.findElement(By.xpath("//input[@name='billing[firstname]']")).sendKeys("Dharani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing:lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='billing:lastname']")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing:street1']")).clear();
		driver.findElement(By.xpath("//input[@id='billing:street1']")).sendKeys("srinivasamgrand boys hostel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing:city']")).clear();
		driver.findElement(By.xpath("//input[@id='billing:city']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		Select element1=new Select(driver.findElement(By.xpath("//select[@id='billing:region_id']")));
		element1.selectByVisibleText("California");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing:postcode']")).clear();
		driver.findElement(By.xpath("//input[@id='billing:postcode']")).sendKeys("25146");
		Select element2=new Select(driver.findElement(By.xpath("//select[@id='billing:country_id']")));
		element2.selectByVisibleText("United States");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing:telephone']")).clear();
		driver.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys("24578633125");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit' and @class='button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='button btn-proceed-checkout btn-checkout'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@title='Continue'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		String number=driver.findElement(By.xpath("//div[@class='main-container col1-layout']//p[1]")).getText();
		System.out.println(number);
	}
}
