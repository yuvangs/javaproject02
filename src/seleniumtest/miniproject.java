package seleniumtest;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class miniproject {
	public static void main(String[] args) throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("yuvan");
		//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("yuvan12");
		//driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		//driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		//driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("yuvan108");
		//driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("yuvan12");
		//driver.findElement(By.xpath("//input[@id=\"re_password\"]")).sendKeys("yuvan12");
		//driver.findElement(By.xpath("//input[@id=\"full_name\"]")).sendKeys("Yuvan");
		//driver.findElement(By.xpath("//input[@id=\"email_add\"]")).sendKeys("yuvangs2002@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"captcha-form\"]")).sendKeys("overstep");
		//driver.findElement(By.xpath("//input[@id=\"tnc_box\"]")).click();
		//driver.findElement(By.xpath("//input[@id=\"Submit\"]")).click();
		//driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("yuvan108");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("yuvan12");
		driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		WebElement drop=driver.findElement(By.xpath("//select[@id=\"location\"]"));
		Select s=new Select(drop);
		s.selectByVisibleText("Melbourne");
		WebElement drop1=driver.findElement(By.xpath("//select[@id=\"hotels\"]"));
		Select s1=new Select(drop1);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement drop2=driver.findElement(By.xpath("//select[@id=\"room_type\"]"));
		Select s2=new Select(drop2);
		s2.selectByVisibleText("Standard");
		WebElement drop3=driver.findElement(By.xpath("//select[@id=\"room_nos\"]"));
		Select s3=new Select(drop3);
		s3.selectByVisibleText("3 - Three");
		driver.findElement(By.xpath("//input[@id=\"datepick_in\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"datepick_in\"]")).sendKeys("25/09/2003");
		driver.findElement(By.xpath("//input[@id=\"datepick_out\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"datepick_out\"]")).sendKeys("30/09/2003");
		WebElement drop4=driver.findElement(By.xpath("//select[@id=\"adult_room\"]"));
		Select s4=new Select(drop4);
		s4.selectByVisibleText("3 - Three");
		WebElement drop5=driver.findElement(By.xpath("//select[@id=\"child_room\"]"));
		Select s5=new Select(drop5);
		s5.selectByVisibleText("1 - One");
		driver.findElement(By.xpath("//input[@id=\"Submit\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("yuvan");
		driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("subramanian");
		driver.findElement(By.xpath("//textarea[@id=\"address\"]")).sendKeys("no 45,ruby street,kk nagar,chennai");
		driver.findElement(By.xpath("//input[@id=\"cc_num\"]")).sendKeys("1234567890123456");
		WebElement drop6=driver.findElement(By.xpath("//select[@id=\"cc_type\"]"));
		Select s6=new Select(drop6);
		s6.selectByVisibleText("VISA");
		WebElement drop7=driver.findElement(By.xpath("//select[@id=\"cc_exp_month\"]"));
		Select s7=new Select(drop7);
		s7.selectByVisibleText("March");
		WebElement drop8=driver.findElement(By.xpath("//select[@id=\"cc_exp_year\"]"));
		Select s8=new Select(drop8);
		s8.selectByVisibleText("2030");
		driver.findElement(By.xpath("//input[@id=\"cc_cvv\"]")).sendKeys("122");
		driver.findElement(By.xpath("//input[@id=\"book_now\"]")).click();
		
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,3000)");

	Thread.sleep(5000);
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Yuvan_New\\eclipse-workspace\\Seleniumtesing\\screenshots\\hotelorder5.png");
		FileHandler.copy(source,destination);
	   driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    TakesScreenshot ts1=(TakesScreenshot) driver;
		File source1=ts1.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\Yuvan_New\\eclipse-workspace\\Seleniumtesing\\screenshots\\hotelorder6.png");
		FileHandler.copy(source1,destination1);
		
	}
}
