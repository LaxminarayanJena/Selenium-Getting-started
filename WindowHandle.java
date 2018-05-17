import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		
		Set<String>winids=	driver.getWindowHandles();		
		Iterator<String> iterate=winids.iterator();
		String first_window=iterate.next();
		String second_window=iterate.next();
		driver.switchTo().window(second_window);
		
		
      driver.findElement(By.xpath("//div[4]/div[2]/div[1]/a")).click();
	}

}
