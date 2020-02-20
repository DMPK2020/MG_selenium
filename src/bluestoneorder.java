import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestoneorder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		 WebElement alljwel = driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
		Actions a =new Actions(driver);
		a.moveToElement(alljwel).build().perform();
		Thread.sleep(5000);
	   WebElement kadas = driver.findElement(By.xpath("//a[contains(.,'Kadas')]"));
	   Actions b = new Actions (driver);
	   b.click(kadas).perform();
	   Thread.sleep(3000);
	   WebElement search = driver.findElement(By.xpath("//a[@id='pid_8966']/parent::div"));
	   search.click();
	   Thread.sleep(3000);
	   Set<String> win1 = driver.getWindowHandles();
	   for (String win:win1) {
			driver.switchTo().window(win);
	
	   }
	   WebElement order = driver.findElement(By.id("buy-now")); order.click();
	   System.out.println(driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText());
	   WebElement logo = driver.findElement(By.xpath("//span[@class='logo-icon']"));
	   logo.click();
	   WebElement text10 = driver.findElement(By.xpath("//strong[contains(.,'10 + 1')]"));
	   text10.click();
	   Thread.sleep(2000);
	   WebElement email = driver.findElement(By.xpath("//div/input[@type='email']"));
	   email.sendKeys("abcd@gmail.com");
	   WebElement submit = driver.findElement(By.xpath("//input[@id='gmsStart']"));
	   submit.click();
	   System.out.println(driver.findElement(By.xpath("//li[contains(.,'Amount is required')]")).getText());
	   WebElement logo1 = driver.findElement(By.xpath("//span[@class='logo-icon']"));
	   logo1.click();
	   Thread.sleep(2000);
	   WebElement subscribe = driver.findElement(By.xpath("//span[@class='subscribe']"));
	   subscribe.click();
	   WebElement amount = driver.findElement(By.xpath("//input[@id='amount']"));
	   amount.sendKeys("1000");
	   WebElement submit1 = driver.findElement(By.xpath("//input[@id='gmsStart']"));
	   submit1.click();
	   System.out.println(driver.findElement(By.xpath("//li[contains(.,'Email is required')]")).getText());
	   
	   
	   
	   
	   
	
}
}