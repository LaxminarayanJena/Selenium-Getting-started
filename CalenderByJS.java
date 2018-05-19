import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderByJS {

	//will work if website allows javascript execution
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://in.via.com/");
		driver.manage().window().maximize();
		
		
		WebElement date = driver.findElement(By.id("departure"));
		String dateVal ="05/25/2018";
		selectDateByJS(driver, date, dateVal);
	}

	

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}
}
