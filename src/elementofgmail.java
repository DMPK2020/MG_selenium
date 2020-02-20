import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementofgmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		WebElement user = driver.findElement(By.id("identifierId"));
		user.sendKeys("manju3011@gmail.com");
		WebElement nex = driver.findElement(By.id("identifierNext"));
		nex.click();
		Thread.sleep(3000);
		WebElement pass =driver.findElement(By.name("password"));
		pass.sendKeys("acdx");
		WebElement nex1 = driver.findElement(By.id("passwordNext"));
		nex1.click();
	}
}
