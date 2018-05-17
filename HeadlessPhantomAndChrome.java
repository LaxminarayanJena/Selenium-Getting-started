import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HeadlessPhantomAndChrome {

	public static void main(String[] args) throws InterruptedException {

		/*
		  DesiredCapabilities dcap = new DesiredCapabilities(); String[] phantomArgs =
		  new String[] { "--webdriver-loglevel=NONE" };
		  Logger.getLogger(PhantomJSDriverService.class.getName()).setLevel(Level.OFF);
		  dcap.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);
		  PhantomJSDriver driver = new PhantomJSDriver(dcap);
		  
		  
		 */

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("window-size=1400,800");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.wikipedia.org/");
		Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
		select.selectByVisibleText("Esperanto");
		System.out.println(driver.getTitle());

	}

}