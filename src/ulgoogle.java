import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ulgoogle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		WebElement pop_up = driver.findElement(By.xpath("//a[@class='google-auth']"));
		pop_up.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("manjusalunke147@gmail.com");
		WebElement next = driver.findElement(By.xpath("//div/div[1]/div[1]/div[1]/span[1]/span[@class='RveJvd snByac']"));
		next.click();
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Change@2020");
	
		
	}				
}
