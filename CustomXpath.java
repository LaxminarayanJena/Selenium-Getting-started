import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("fan");
		
		driver.findElement(By.xpath("//input[contains(@class,'btn btn-prim gh-spr')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'gh-b')]")).click();
		driver.findElement(By.xpath("//legend[starts-with(@id,'kw_')]")).getText();
		driver.findElement(By.xpath("//a[contains(text(),'Gift')]")).click();
		
		//absolute path is not recoomended
		
	}

}
