package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class javascriptexecutor {
	static WebDriver driver;
	public static void mname1() throws InterruptedException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		mname2();
	}
	public static void mname2() throws InterruptedException {
		driver.get("https://adactinhotelapp.com/");
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
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,1000)");
		//Thread.sleep(2000);
		//j.executeScript("window.scrollBy(0,-1000)");
		//Thread.sleep(1000);
		//Object str=j.executeScript("return document.document.str");
		//System.out.println(str);
		//String title= j.executeScript("return document.title").toString();
		//System.out.println(title);
		//WebElement elementintoview= driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		//j.executeScript("arguments[0].scrollIntoView();",elementintoview);
		//j.executeScript("document.getElementById('twotabsearchtextbox').value='Iphone'");
		//WebElement elec= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//j.executeScript("arguements[0].click()",elec);
		//j.executeScript("window.location='https://www.facebook.com/'");
	}
	public static void main(String[] args) throws InterruptedException {
		mname1();
	}

}
