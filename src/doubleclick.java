import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
   // WebElement button = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
    //Actions a = new Actions (driver);
	//a.doubleClick(button).perform();
	WebElement right = driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
	Actions b = new Actions (driver);
	Thread.sleep(8000);
	b.contextClick(right).perform();
	
}
}
