package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {
	
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().window().minimize();//manage-used to manage the window
	driver.get("https://web.whatsapp.com/");//web application
	//refname.get("string url");-get used to get url(uniform resource locator)
	String title=driver.getTitle();//gets tab in up of website title
	System.out.println(title);
	String url=driver.getCurrentUrl();//this is used to get currenturl
	System.out.println(url);
	driver.navigate().to("https://www.youtube.com/");//navigate is used to navigate from one website to another
	String title1=driver.getTitle();
	System.out.println(title1);
	String url1=driver.getCurrentUrl();
	System.out.println(url1);
	Thread.sleep(4000);//for sleep we need to use throws with interruptedexecption
	//sleep is used wait for given time 4000 miliseconds-4 sec-it is a staticwait
	driver.navigate().to("https://www.instagram.com/accounts/login/");
	String url2=driver.getCurrentUrl();
	System.out.println(url2);
	System.out.println(driver.getTitle());
	//if we use get it also gives same result
	Thread.sleep(2000);
	driver.navigate().back();
	//navigate has 4 types- to(website),forward,back,refresh
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	String titlee=driver.getTitle();
	System.out.println(titlee);
	Thread.sleep(1000);
	driver.navigate().forward();
    String url3=driver.getCurrentUrl();
    System.out.println(url3);
    System.out.println(driver.getTitle());
    Thread.sleep(2000);
    driver.navigate().refresh();//reloads and comes back
    driver.close();
    driver.quit();
	
}


}
