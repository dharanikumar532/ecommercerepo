package ecomerce_package;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifymobiledropdown
{
public static void main(String as[]) throws Throwable
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://live.techpanda.org/index.php");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
String ptitle=driver.getTitle();
Thread.sleep(2000);
driver.findElement(By.linkText("MOBILE")).click();
String ctitle=driver.getTitle();
Date d=new Date();
DateFormat df=new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
String date=df.format(d);
System.out.println("parent title is "+ptitle+"   "+"child title is  "+ctitle);
File screen1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screen1, new File("D:/screen1"+date+"before.png"));
Thread.sleep(2000);
Select element=new Select(driver.findElement(By.xpath("//select[@onchange='setLocation(this.value)']")));
element.selectByVisibleText("Name");
Thread.sleep(2000);
File screen2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screen2, new File("D:/screen2"+date+"after.png"));
Thread.sleep(2000);
driver.close();
}
}