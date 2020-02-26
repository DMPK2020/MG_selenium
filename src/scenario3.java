import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement coins = driver.findElement(By.xpath("//ul/li[8]/a[contains(.,'Coins')]"));
		Actions a =new Actions(driver);
		a.moveToElement(coins).build().perform();
		WebElement twogm = driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-2gms,m']"));
		twogm.click();
		String S1= "(2 gram)";
		String S2 = driver.findElement(By.xpath("//span[text()='(2 gram)']")).getText();
		if (S1.equals(S2)) {
			System.out.println(" Verified 2 laxmi gram Gold coin");
			driver.quit();
		} else {
			System.out.println(" This is not a 2gm Gold coin");
			driver.quit();
			
		}
		
}

}
