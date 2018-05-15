import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//1.xpath
		
		//abolute xpath should not be used -//div//h1[]
		//only relative xpath should be used -.//*[@id='firstname']"
		driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys("rama");
		driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("mishara");
		
		
		//2.id -priority1
		
		driver.findElement(By.id("lastname")).sendKeys("tom");
		driver.findElement(By.id("firstname")).sendKeys("ramaa");
		
		
		//3.name
		
		driver.findElement(By.name("firstname")).sendKeys("ram");
		driver.findElement(By.name("lastname")).sendKeys("hari");
		
		//4.cssselector
		
		driver.findElement(By.cssSelector("#firstname")).sendKeys("ramesh");
		
		//id- #id
		//class-.class
		
		Thread.sleep(3000);
		
		//7.classname
		
		//driver.findElement(By.className("ml53 tx")).click();
				
				
		
		//5.linktext
		
		//driver.findElement(By.linkText("User Agreement")).click();
		
		//6.partiallinktext

		//driver.findElement(By.partialLinkText("Privacy Notice")).click();
		
		
		
		
		
	}

}