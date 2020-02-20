import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign1802 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("java", Keys.ENTER);
	List<WebElement> bold = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
	for (WebElement text : bold) {
		System.out.println(text.getText());
		
	}
	bold.get(3).click();
	System.out.println(bold.size());
}	
}