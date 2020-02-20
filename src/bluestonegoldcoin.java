import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonegoldcoin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement coins = driver.findElement(By.xpath("//ul/li[8]/a[contains(.,'Coins')]"));
		Actions a =new Actions(driver);
		a.moveToElement(coins).build().perform();
		WebElement twentygm = driver.findElement(By.xpath("//li[@class='active']/span[contains(.,'20 gram')]"));
		Actions b =new Actions(driver);
		b.moveToElement(twentygm).build().perform();
		
		
		
		
}
}