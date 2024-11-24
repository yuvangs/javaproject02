package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	WebDriver driver=new ChromeDriver();
	public void simplealert() throws InterruptedException {
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		WebElement simplealert=driver.findElement(By.xpath("//input[@onclick='show_alert()']"));
		simplealert.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
	}
	public void confirmalert() throws InterruptedException {
		WebElement confirmalert=driver.findElement(By.xpath("//input[@id='confirmexample']"));
		confirmalert.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		
	}
	public void promptalert() throws InterruptedException {
		WebElement prompt=driver.findElement(By.xpath("//input[@value='Show prompt box']"));
		prompt.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("hi");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Alert a=new Alert();
		a.simplealert();
		a.confirmalert();
		a.promptalert();
	}
	

}
