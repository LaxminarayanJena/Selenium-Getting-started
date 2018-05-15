import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//1.firefox  browser
/*		System.setProperty("webdriver.gecko.driver", "D:\\Software\\Testing Software\\selenium\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null"); 		
		WebDriver driver = new FirefoxDriver();	
	*/	
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		//validations
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		
		else
		{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		driver.quit();
	}

}
