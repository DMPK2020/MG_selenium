import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascroll {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2000)");
		//ScreenDemo.screenshot(driver, "selenium");
		//js.executeScript("window.scrollBy(0,-1000)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		WebElement ele = driver.findElement(By.xpath("//h2[contains(.,'Platinum Level Sponsors')]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		
}
}