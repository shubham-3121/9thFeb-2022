package handlingmultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", driverPath);
//		or
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("cricbuzz");
		
		List<WebElement> element1 = driver
				.findElements(By.cssSelector("ul[class='erkvQe']>div>ul>li>div>div[class='pcTkSc']>div>span>b"));
		System.out.println("Find Releated Search Options Size : "+element1.size());
		for(WebElement list1:element1) {
			System.out.println(list1.getText());
		}
//		driver.findElement(By.cssSelector("div[class='aajZCb']>div>center>input[class='gNO89b']")).click();
		
	}

}
