import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		//Alert class
		
		System.out.println(alert.getText());
		String text =alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("test pass");
			
		}
		else
		{
			System.out.println("test fail");
		}
		
		alert.accept();
		
		//alert.dismiss();
		
		

	}

}
