package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static void loadPropertiesFile() throws IOException
	{
		prop=new Properties();
		FileInputStream fis = new FileInputStream("D:\\EclipseMavenWorkSpace\\cucumberwithmaps\\config.properties");
		prop.load(fis);
		
	}
	public static void launchBrowser()
	{
		
	System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
	
	driver=new ChromeDriver();
	
	
	}
}
