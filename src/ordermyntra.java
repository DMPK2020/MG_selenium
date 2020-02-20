import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ordermyntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement home = driver.findElement(By.xpath("//div[4]/div/a[contains(.,'Home & Living')]"));
		Actions a =new Actions(driver);
		a.moveToElement(home).build().perform();
		Thread.sleep(5000);
		WebElement carpet = driver.findElement(By.xpath("//a[contains(.,'Carpets')]"));
		Actions b = new Actions (driver);
		b.click(carpet).perform();
		Thread.sleep(3000); 
		WebElement select = driver.findElement(By.xpath("//ul/li[1]/descendant::a[@target='_blank']"));
		select.click();
		Thread.sleep(5000);
		 Set<String> win1 = driver.getWindowHandles();
		   for (String win:win1) {
				driver.switchTo().window(win);
  }
 }
}