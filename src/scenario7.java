import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='top-filter']/descendant::span[text()='Delivery Time']")).click();
		driver.findElement(By.xpath("//form[@id='delivery time']/descendant::div[3]/span[text()=' Next Day Delivery ']")).click();
		List<WebElement> search = driver.findElements(By.xpath("//ul[@id='product_list_ui']/li"));
		System.out.println("Next Day Delivery results :" + search.size());
		driver.quit();
}
}