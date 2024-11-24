package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		WebElement w=driver.findElement(By.name("email"));
		//System.out.println(w);
		w.sendKeys("yuvangs2002@gmail.com");
		WebElement w1=driver.findElement(By.id("pass"));
		w1.sendKeys("yuvan2002");
		WebElement w2=driver.findElement(By.name("login"));
		w2.click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement w3=driver.findElement(By.id("twotabsearchtextbox"));
		w3.sendKeys("Iphone");
	    WebElement w4=driver.findElement(By.id("nav-search-submit-button"));
	    w4.click();
	    driver.navigate().to("https://demoqa.com/text-box");
	    WebElement w5=driver.findElement(By.id("userName"));
	    w5.sendKeys("Yuvan");
	    WebElement w6=driver.findElement(By.id("userEmail"));
	    w6.sendKeys("yuvangs2002@gmail.com");
	    WebElement w7=driver.findElement(By.id("currentAddress"));
	    w7.sendKeys("no 4,vivekanadhar kovil street,ashok nagar,chennai");
	    WebElement w8=driver.findElement(By.id("permanentAddress"));
	    w8.sendKeys("no 4,vivekanadhar kovil street,ashok nagar,chennai");
	    WebElement w9=driver.findElement(By.id("submit"));
	    w9.click();
		
	}

}
