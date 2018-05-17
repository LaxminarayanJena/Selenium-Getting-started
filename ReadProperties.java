import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("D:\\Projects\\Selenium\\src\\Config.Properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		

	}

}
