package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	   // WebElement w=driver.findElement(By.xpath("//input[@placeholder='email']"));
	   //WebElement w1=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	   // w1.click();
	   // WebElement w2=driver.findElement(By.xpath("//a[@title='Browse our Facebook Services directory.']"));
	   // w2.click();
	  //input[@value='2918']
	  //link[@media='handheld']
	    driver.navigate().to("https://www.amazon.in/");
	    //contains gets with partial value
	  //form[contains(@id,'bar')]
	  //input[contains(@spellcheck,'fa')]
	  //input[contains(@name,'cri')]
	  //meta[contains(@name,'des')]
	  //label[contains(@for,'box')]
	    driver.navigate().back();
	  //only using full text and tagname
	  //a[text()='Forgotten password?']
	  //a[text()='About']
	  //script[text()='__DEV__=0;']
	  //title[text()='Facebook – log in or sign up']
	    //a[text()='Cookies']
	    driver.navigate().to("https://www.instagram.com/");
	    //partial text and tagname and contains
	  //style[contains(text(),'html')]
	  //span[contains(text(),'Log i ')
	    //span[contains(text(),'Forgotten')]
	  //span[contains(text(),'Sign u')]
	   //title[contains(text(),'Insta')]
	    driver.navigate().to("https://www.flipkart.com/");
	  //input[@type='hidden'][1]
	  //div[@class='_2-LWwB'][3]
	  //script[@type='application/ld+json'][1]
	  //script[@id='__LOADABLE_REQUIRED_CHUNKS__'][1]
	  //link[@rel='preconnect'][2]
	    
	    
	    
	    
	
	}

}
