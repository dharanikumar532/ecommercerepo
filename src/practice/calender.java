package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//li[@class='parent'])[6]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Calendars Practice")).click();
		int day=1;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()="+day+"]")).click();

	}

}
