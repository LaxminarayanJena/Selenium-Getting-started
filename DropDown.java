import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");

		//create object of select class
		Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
		select.selectByVisibleText("Esperanto");

	}

}
