import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {
	
	
	public static void main(String[] args) throws ParseException, InterruptedException{
		
		
		String selectdata = "11/15/2018";
		Date d = new Date(selectdata);
		
		SimpleDateFormat dt = new SimpleDateFormat("MMMM/dd/yyyy");
        String date = dt.format(d);
        System.out.println(date);
        
        String[] split = date.split("/");
        String month = split[0]+" "+split[2];
        System.out.println(month);
        
        //div[contains(text(),'September 2018')]
        
     
        
     //  .//*[@id='fare_20180915']   -----date of the calender
        String[] split1 = selectdata.split("/");      
        
        String xpath= split[2]+split1[0]+split[1];
        System.out.println(xpath);
        String finaldatexpath =".//*[@id='fare_"+xpath+"']";
        System.out.println(finaldatexpath);
        
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//*[@id='gi_oneway_label']")).click();
		driver.findElement(By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/input")).click();
		
		Thread.sleep(2000);
		while(true){
			try{							
				driver.findElement(By.xpath(finaldatexpath)).click();
				break;
			}
			catch(Exception e){
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				Thread.sleep(1000);
			}
		}
	}

}