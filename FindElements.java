import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com");
		
		//get the total no of links on page
		//get the text of each link on page
		
	
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		
		for(int i=0; i<linkList.size(); i++)
		{
			String linktext=linkList.get(i).getText();
			System.out.println(linktext);
		}

	}

}
