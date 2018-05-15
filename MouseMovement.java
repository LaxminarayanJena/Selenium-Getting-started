import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://spicejet.com/");

			//Thread.sleep(3000);
			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
			
			driver.findElement(By.linkText("Hot Meals")).click();

}
}