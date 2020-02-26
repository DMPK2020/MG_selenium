import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
	driver.findElement(By.xpath("//span[contains(.,'More Filters')]")).click();
	driver.findElement(By.xpath("//span[@data-displayname='22k']")).click();
	List<WebElement> results = driver.findElements(By.xpath("//ul[@id='product_list_ui']/li"));
	System.out.println("22k ring results:"+ results.size());
	driver.quit();
	
	
	
}
}
