import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement adv = driver.findElement(By.xpath ("//button[@class='_2AkmmA _29YdH8']"));
		adv.click();
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement items : menu) {
			String item= items.getText();
			System.err.println(item);
			a.moveToElement(items).build().perform();
			Thread.sleep(2000);
			List<WebElement> menuName = driver.findElements(By.xpath("//span[contains(.,'"+ item +"')]/parent::li/descendant::ul[@class='QPOmNK']/li"));
				for (WebElement menus : menuName) {
					System.out.println(menus.getText());
				}
		}
		
	}	
		
		
		
		//WebElement search = driver.findElement(By.xpath ("//input[@name='q']"));
		//search.sendKeys("mobiles",Keys.ENTER);
		
	
}
