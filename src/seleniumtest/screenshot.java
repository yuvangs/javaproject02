package seleniumtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;//typecasting driver is also a small interface in takesscreenshot which is also a interface
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Yuvan_New\\eclipse-workspace\\Seleniumtesing\\screenshots\\facebook.png");
		//create folder by clicking the project and go to folder and create and go to properties to get path
		FileHandler.copy(source,destination);//it gives io(input,output) exception
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		File source1=email.getScreenshotAs(OutputType.FILE);
	    File destination1=new File("C:\\Users\\Yuvan_New\\eclipse-workspace\\Seleniumtesing\\screenshots\\email1facebook.png");
	    FileHandler.copy(source1, destination1);//refresh the folder to get new images
	    //FileUtils.copyFile(source1,destination1);
	}

}
