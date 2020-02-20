import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonemha {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	 List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
	 Actions a =new Actions(driver);
	 Thread.sleep(2000);
	 for (WebElement items : menus) {
		 String menuName = items.getText();
		 System.err.println(menuName);
		 a.moveToElement(items).build().perform();
		 Thread.sleep(5000);
		 List<WebElement> submenus = driver.findElements(By.xpath("//a[contains(.,'"+ menuName +"')]/parent::li/descendant::ul[@class='odd-even-bg']/li/div/ul/li"));
		 for (WebElement Names : submenus) {
			System.out.println(Names.getText());
			
		}
	}
	 
}
}
