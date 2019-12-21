package TM_Selenium_HRM.TM_Selenium_HRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\SeleniumProject\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm");
		
		System.out.println("Login Page Opened");
	}

}
