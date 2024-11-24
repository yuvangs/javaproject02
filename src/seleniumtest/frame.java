package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		WebElement name=driver.findElement(By.name("fname"));
		name.sendKeys("yuvan");
		WebElement name1=driver.findElement(By.name("lname"));
		name1.sendKeys("s");
		WebElement innerfr=driver.findElement(By.xpath("//iframe[@id=\"firstFr\"]"));
		driver.switchTo().frame(innerfr);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("yuvan@gmail.com");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class=\"card-footer-item\"]")).click();
	}

}
