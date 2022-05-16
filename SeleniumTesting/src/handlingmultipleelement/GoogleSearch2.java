package handlingmultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("honda");

		List<WebElement> element1 = driver
				.findElements(By.cssSelector("ul>div>ul>li>div>div[class='pcTkSc']>div>span>b"));
		System.out.println("lenth" + element1.size());
		for (WebElement list : element1) {
			System.out.println(list.getText());
		}
	}

}
