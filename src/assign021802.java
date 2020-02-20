import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class assign021802 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement ring = driver.findElement(By.xpath("//nav/ul/li/a[contains(.,'Rings')]"));
		ring.click();
		Thread.sleep(10000);
		List<WebElement> rings = driver.findElements(By.xpath("//ul[@class='product-grid ']/descendant::a/img"));
		for (WebElement all : rings) {
			
		}
		System.out.println(rings.size());
}
}