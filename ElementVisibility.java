import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/register/");

		// 1.isDisplayed
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);

		// 2.isEnabled

		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);

		

		driver.findElement(By.name("agreeTerms")).click();

		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);
		
		// 3.isSelected  only applicable for checkbox,dropdown,radiobutton
		
		boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);
		
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);
		
	}

}
