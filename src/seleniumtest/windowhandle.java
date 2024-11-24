package seleniumtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	String windowh=driver.getWindowHandle();
	System.out.println(windowh);
	WebElement search=driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
	search.sendKeys("iphone");
	driver.findElement(By.xpath("(//input[@class=\"nav-input nav-progressive-attribute\"])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Apple iPhone 16 (256 GB) - Ultramarine']")).click();
	Set <String> windowhandles= driver.getWindowHandles();
	for (String string : windowhandles)//fore control space 
		{
		System.out.println(string);
		
	}
	List<String> all= new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(all.get(1));
	String text=driver.findElement(By.id("productTitle")).getText();
	System.out.println(text);
	//driver.quit();
	
}
}
