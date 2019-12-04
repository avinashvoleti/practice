package baseclass.qa.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.qa.pages.TestUtil;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	
	public void TestBase() throws IOException {
		
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Ecilipse\\Test_Project\\src\\main\\java\\environmentconfig\\qa"
						+ "\\pages\\config.properties");
			prop.load(ip);
		
	}

public static void intialization() {
		System.setProperty("webdriver.chrome.driver","D:\\Ecilipse\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.MILLISECONDS);
	driver.get("https://erwin.com/");
}
}
