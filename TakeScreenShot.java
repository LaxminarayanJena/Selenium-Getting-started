import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	static WebDriver driver;

	public static void captureScreenshot() throws IOException {
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int hr = cal.get(Calendar.HOUR_OF_DAY);

		String screenshotName = date + "_" + (month + 1) + "_" + year + "_"
				+ hr + "_" + min + "_" + sec + ".jpeg";
		String mailscreenshotpath = System.getProperty("user.dir")+"//" + screenshotName;
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(mailscreenshotpath));

	}

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		captureScreenshot();
		driver.quit();

	}

}
