import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class followingsibling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(9000);
		WebElement cls_child = driver.findElement(By.xpath ("//a[@class='close-reveal-modal hide-mobile']"));
		cls_child.click();
		WebElement menu = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/following-sibling::li"));
		System.out.println(menu.getText());
		
		
		//span[contains(.,'Sale')]/ancestor::div[@id="topnav_wrapper"] ancestor
		//span[contains(.,'Sale')]/following::li[@class='topnav_item livingunit'] following
	}	
}
