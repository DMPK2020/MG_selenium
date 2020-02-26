import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitsyn {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java", Keys.ENTER);
		List<WebElement> bold = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		WebDriverWait ww = new WebDriverWait(driver, 20);
		//ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='gb_4 gb_5 gb_ce gb_Wc']")));
		//ww.until(ExpectedConditions.attributeContains(By.name("q"), "value", "java"));
		ww.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[@class='gb_4 gb_5 gb_ce gb_Wc']"), "Sign in"));
		
		System.out.println("search completed");
		//bold.get(0).click();
	
		
	
		
}
}