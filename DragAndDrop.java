import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		WebElement draggable= driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement droppable= driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		action.dragAndDrop(draggable, droppable).perform();
		
	}

}
