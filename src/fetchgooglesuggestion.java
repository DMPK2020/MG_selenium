import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fetchgooglesuggestion {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
	WebDriverWait ww = new WebDriverWait(driver, 10);
	ww.until(ExpectedConditions.titleContains("aalia"));
	System.out.println("search completed");
	
	/*Thread.sleep(3000);
	search.sendKeys("Java");
	Thread.sleep(2000);
	List<WebElement> all = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	for (WebElement suggestion : all) {
		System.out.println(suggestion.getText());
	}
	all.get(3).click();
	System.out.println();all.size();*/
	
}
}
