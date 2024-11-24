package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("https://web.whatsapp.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.youtube.com/");
		String title1=driver.getTitle();
		System.out.println(title1);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(4000);
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		System.out.println(driver.getTitle());
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		Thread.sleep(2000);
		driver.navigate().back();
		String titlee=driver.getTitle();
		System.out.println(titlee);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(1000);
		driver.navigate().forward();
	    String url3=driver.getCurrentUrl();
	    System.out.println(url3);
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    driver.close();
	    driver.quit();

}}
