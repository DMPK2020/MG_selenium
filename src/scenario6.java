import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
		driver.findElement(By.id("Price-form")).click();
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		List<WebElement> search = driver.findElements(By.xpath("//section/descendant::span[@class='product-details']"));
		System.out.println("Below Rs.10000 results :" + search.size());
		driver.quit();
		
}
}