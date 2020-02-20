import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartall {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement adv = driver.findElement(By.xpath ("//button[@class='_2AkmmA _29YdH8']"));
		adv.click();
		List<WebElement> flipall = driver.findElements(By.xpath ("//ul[@class='_114Zhd']/li"));
		for (WebElement items : flipall) {
			System.out.println(items.getText());
		}
	}	
}
	
