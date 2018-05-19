import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a/label"));
		
		
		
		
		System.out.println(list.size());
	
		//To select a particular value
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("MySQL"))
			{
				list.get(i).click();
				break;
			}
			
		}

	}

}
