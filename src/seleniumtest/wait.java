package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
static WebDriver driver; 
static void implicit() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	WebElement email=driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\""));
	email.sendKeys("yuvan@gmail.com");
}
static void explicit() {
	driver.navigate().to("https://letcode.in/signup");
	WebElement name=driver.findElement(By.xpath("//input[@placeholder=\"Enter your name\"]"));
	name.sendKeys("yuvan");
	WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	email.sendKeys("yuvan@gmail.com");
	WebElement pass=driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]"));
	pass.sendKeys("yuvan11");
	WebElement toast=driver.findElement(By.id("toast-container"));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
	wait.until(ExpectedConditions.visibilityOf(toast));
	wait.until(ExpectedConditions.invisibilityOf(toast));
	WebElement signup = driver.findElement(By.linkText("Sign up"));
	signup.click();
	
	
}
public static void main(String[] args) {
	implicit();
	explicit();
}
}
