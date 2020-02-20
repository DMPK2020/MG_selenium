import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orderflip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement adv = driver.findElement(By.xpath ("//button[@class='_2AkmmA _29YdH8']"));
		adv.click();
		WebElement main = driver.findElement(By.xpath("//span[contains(.,'Home & Furniture')]"));
		Actions a =new Actions(driver);
		a.moveToElement(main).build().perform();
		Thread.sleep(1000);
		WebElement clocks = driver.findElement(By.xpath("//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']/preceding::li/a[contains(.,'Clocks')]"));
		Actions b = new Actions (driver);
		b.click(clocks).perform();
		Thread.sleep(3000); 
		WebElement select = driver.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C']/div[2]/descendant::div[1]/div"));
		select.click();
		Thread.sleep(5000);
		   Set<String> win1 = driver.getWindowHandles();
		   for (String win:win1) {
				driver.switchTo().window(win);
		
		   }
		  WebElement order = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']"));
		  order.click(); 
		  
		   
}
}