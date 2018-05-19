import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.co.in/");
			
			
			driver.findElement(By.id("lst-ib")).sendKeys("testing");
			
			List<WebElement> list= driver.findElements(By.xpath("//ul[@class='sbsb_b']//li//div[2]"));
			System.out.println(list.size());
			
			
			for(int i=0 ; i<list.size() ; i++)
			{
				System.out.println(list.get(i).getText());
			}
	}

}
