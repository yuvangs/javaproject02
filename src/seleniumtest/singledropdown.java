package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement all=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select se=new Select(all);	
        se.selectByValue("search-alias=nowstore");
        Thread.sleep(2000);
        se.selectByIndex(7);
        Thread.sleep(2000);
        se.selectByVisibleText("Audible Audiobooks");
        boolean check=se.isMultiple();
        System.out.println(check);
        List<WebElement> elements=se.getOptions();
        for(WebElement printlist:elements) {
        	System.out.println(printlist.getText());
        }
      
	}

}
