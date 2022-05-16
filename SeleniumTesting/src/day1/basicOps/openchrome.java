package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome {

	public static void main(String[] args) {
		String driverPath1 = "D:\\Acceleration\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		// or
		String driverPath2 = "\\executables\\chromedriver.exe";
		// or
		String driverPath3 = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath3);

		//ChromeDriver cdriver = new ChromeDriver();
		//or
		
		WebDriver driver = new ChromeDriver();
		driver.close();
	}

}
