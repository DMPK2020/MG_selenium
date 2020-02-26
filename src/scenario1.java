import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class scenario1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement coins = driver.findElement(By.xpath("//ul/li[8]/a[contains(.,'Coins')]"));
		Actions a =new Actions(driver);
		a.moveToElement(coins).build().perform();
		WebElement twentygm = driver.findElement(By.xpath("//ul/li[8]/descendant::span[@data-p='gold-coins-weight-20gms,m']"));
		twentygm.click();
		String S1= "20";
		String S2 = driver.findElement(By.xpath("//span[text()='20']")).getText();
		if (S1.equals(S2)) {
			System.out.println(" Verified 20gm Gold coin");
			driver.quit();
		} else {
			System.out.println(" This is not a 20gm Gold coin");
			driver.quit();
		}
		
		
}
}