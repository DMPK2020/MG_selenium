import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntramha {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	List<WebElement> menu = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
	Actions a = new Actions (driver);
	Thread.sleep(1000);
	for (WebElement all : menu) {
		String item = all.getText();
		System.err.println(item);
		a.moveToElement(all).build().perform();
		Thread.sleep(5000);
		List<WebElement> submenu = driver.findElements(By.xpath("//a[contains(.,'"+ item +"')]/parent::div/descendant::ul[@class='desktop-navBlock']/li"));
		for (WebElement names : submenu) {
			System.out.println(names.getText());
			Thread.sleep(2000);

		}
		
	}
	
}
}
