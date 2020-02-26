import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class contextclicknalert {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(right).build().perform();
		List<WebElement> act = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
			for (WebElement ele : act) {
				String item= (ele.getText());
				Actions b = new Actions(driver);
				b.moveToElement(ele).perform();
				screenshot(driver,item);
				ele.click();
				Thread.sleep(2000);
				Alert ab = driver.switchTo().alert();
				ab.accept();	
				for (int i = 0; i <act.size(); i++) {
					a.contextClick(right).perform();
	
			}
		}
}			
			public static void screenshot(WebDriver driver, String name) throws IOException {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File screenshot = ts.getScreenshotAs(OutputType.FILE);
				File screensave = new File("./screenshot/" +name +".png");
				Files.copy(screenshot, screensave);
}
}