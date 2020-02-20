import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automha {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	 List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
	 Actions a = new Actions (driver);
	 Thread.sleep(2000);
	 for (WebElement items : menus) {
		 System.out.println(items.getText());
		 a.moveToElement(items).build().perform();
		 Thread.sleep(2000);
		 
		
	}
	 
	 
}
}
