import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("D:\\git commands\\git commands.txt");
		
		//in html -type="file"/

	}

}
