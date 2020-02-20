import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipiphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement adv = driver.findElement(By.xpath ("//button[@class='_2AkmmA _29YdH8']"));
		adv.click();
		WebElement search = driver.findElement(By.xpath ("//input[@name='q']"));
		search.sendKeys("iphone",Keys.ENTER);
		Thread.sleep(7000);
		WebElement first = driver.findElement(By.xpath("//a[contains(.,'Apple iPhone 7 (Black, 32 GB)')]"));
		first.click();
	}
}
