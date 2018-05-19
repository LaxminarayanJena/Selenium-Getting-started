import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.freecrm.com/index.html");
			driver.findElement(By.name("username")).sendKeys("heardm");
			driver.findElement(By.name("password")).sendKeys("123heard");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			//ctrl+u- view page source
			driver.switchTo().frame("mainpanel");
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			

		//	.//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		//	.//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input
		//1st method	
			String before_xpath=".//*[@id='vContactsForm']/table/tbody/tr[";
			String after_xpath="]/td[2]/a";
			
			for(int i=4 ; i <=7 ;i++)
			{
				String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
				System.out.println(name);
				if(name.contains("Michael Jackson"))
				{
					WebElement checkbox= driver.findElement(By.xpath(before_xpath+i + "]/td[1]/input"));
					checkbox.click();
				}
				
			}
			
			//2nd method
			driver.findElement(By.xpath("//a[@context='contact' and contains(text(),'Tom Peter')]//parent::td[1]//preceding::td[1]//input")).click();
	}

}
 