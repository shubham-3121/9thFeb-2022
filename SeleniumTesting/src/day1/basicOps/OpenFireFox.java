package day1.basicOps;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		String driverPath1 = "D:\\Acceleration\\workspace\\SeleniumTesting\\executables\\geckodriver.exe";
		//or
		
		String driverPath2="\\executables\\geckodriver.exe";
		//or
		
		String driverPath3= System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		
		
		
		System.setProperty("webdriver.gecko.driver",driverPath3);
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.close();

	}

}