import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
		WebElement gender = driver.findElement(By.xpath("//section[@id='Gender-form']"));
		Actions a = new Actions(driver);
		a.moveToElement(gender).build().perform();
		driver.findElement(By.xpath("//span[@data-displayname='women']")).click();
		List<WebElement> all = driver.findElements(By.xpath("//ul[@id='product_list_ui']/li/span"));
		System.out.println("women ring results:"+ all.size());
		driver.quit();
		
		
}
}