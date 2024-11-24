package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> table=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		for (WebElement tabler : table) {
			String text=tabler.getText();
			System.out.println(text);
		}
	List<WebElement> col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td"));
	for (WebElement web : col) {
		String text1=web.getText();
		System.out.println(text1);
		
	}
	}

}
