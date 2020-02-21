import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestonegoldcoin {
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
		driver.findElement(By.id("buy-now")).click();
		driver.findElement(By.xpath("//a[contains(.,'Place Order')]")).click();
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("contactNumber")).sendKeys("1010101010");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.id("fullname")).sendKeys("ABCD");
		driver.findElement(By.id("postcode_delivery")).sendKeys("542136");
		driver.findElement(By.id("address")).sendKeys("A258");	
		driver.findElement(By.id("street")).sendKeys("LBSroad");
		driver.findElement(By.id("locality")).sendKeys("Nagar");
		driver.findElement(By.id("landmark")).sendKeys("behind post office");
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.presenceOfElementLocated(By.id("cityName_delivery"))).sendKeys("Anagar");
		WebElement state = driver.findElement(By.id("stateId_delivery"));
		Select s = new Select(state);
		s.selectByIndex(10);
		driver.findElement(By.xpath("//button[contains(.,'Proceed to Payment')]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='* This field is required']")).getText());
		
		
}
}