import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	WebElement f = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(f);
	WebElement eleSou = driver.findElement(By.id("draggable"));
	WebElement eleTar = driver.findElement(By.id("droppable"));
	Actions a = new Actions (driver);
	a.dragAndDrop(eleSou, eleTar).perform();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.id("droppable")).getText());
	
}
}
