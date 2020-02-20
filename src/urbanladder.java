import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(9000);
		WebElement cls_child = driver.findElement(By.xpath ("//a[@class='close-reveal-modal hide-mobile']"));
		cls_child.click();
		WebElement stores = driver.findElement(By.xpath ("//ul/li[2]/a[@class='featuredLinksBar__link']"));
		stores.click();
		List<WebElement> cities = driver.findElements(By.xpath("//div[@class='_12wcw']/h3"));
		for (WebElement Names : cities) {
			System.out.println(Names.getText());
		}
	}	
}
