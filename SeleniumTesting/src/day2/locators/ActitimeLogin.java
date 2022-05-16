package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class ActitimeLogin {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
SeleniumUtility s1=new SeleniumUtility();
WebDriver driver1 =s1.setUp("chrome" ,"https://demo.actitime.com/login.do" );
		//driver.get("https://demo.actitime.com/login.do");
		String expectedTitle = "actiTIME Login";
		String actualTitle = driver1.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully....");
		} else {
			System.out.println("Eighrt Logine page is not opened or page Title got changed");

		}

		WebElement userNameInputField = driver1.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		WebElement passwordInputfield = driver1.findElement(By.name("pwd"));
		passwordInputfield.sendKeys("manager");
		WebElement loginButton = driver1.findElement(By.id("loginButton"));
		loginButton.click();
		
//		WebElement logoutBtn = driver.findElement(By.linkText("logout"));
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
		
		System.out.println("home page title:" + driver1.getTitle());
		//logoutBtn.click();
//close browser
//driver.close();

	}

}
