package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class assending {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.facebook.com/'");
 		Thread.sleep(5000);
		js.executeScript("document.getElementById('email').value='dharani'");
		WebElement element=(WebElement)js.executeScript("return document.getElementsByName('pass')[0]");
		element.sendKeys("145555");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByClassName('inputtext')[0].style.border='5px blue solid'");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByClassName('inputtext')[0].style.background='yellow'");
		
		
	}

}
