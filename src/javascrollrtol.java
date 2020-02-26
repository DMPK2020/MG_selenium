import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascrollrtol {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(13000);
		WebElement adv = driver.findElement(By.xpath ("//button[@class='_2AkmmA _29YdH8']"));
		adv.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(300,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-100,0)");
		//do for window.scrollTo(document.body.scrollWidth,0)
		
		
}
}