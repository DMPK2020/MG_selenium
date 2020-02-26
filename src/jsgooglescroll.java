import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jsgooglescroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java", Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		boolean flag = true;
		while(flag){
			WebDriverWait ww = new WebDriverWait(driver, 10);
			ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Next']")));
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			JavascriptExecutor jsl = (JavascriptExecutor) driver;
			jsl.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(3000);
		
		}
		
		
		
		
		
		
		
}
}