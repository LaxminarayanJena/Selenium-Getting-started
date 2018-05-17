import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("lnarayan.jena@gmail.com");
		
        clickOn(driver, driver.findElement(By.xpath(".//*[@id='identifierNext']")), 10);
		
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("ffff");
	
		clickOn(driver, driver.findElement(By.xpath(".//*[@id='passwordNext']")), 10);
					
		Thread.sleep(2000);  //Hard coded wait  otherwise text will not be printed
							
		System.out.print(driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).getText());

	}


	public static void clickOn(WebDriver driver, WebElement locator, int timeout) { 
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator)); 
				locator.click(); 
		 	} 
	
	
	

}
