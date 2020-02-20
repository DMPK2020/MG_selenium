import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findele {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.xpath ("//input[@type='email']"));
	user.sendKeys("Abcd@gmail.com");
	WebElement user1 = driver.findElement(By.xpath ("//input[@name='pass']"));
	user1.sendKeys("ac12&");
	WebElement user2 = driver.findElement(By.xpath ("//label[@id='loginbutton']"));
	user2.click();
	
	//WebElement user = driver.findElement(By.id("email"));
   // user.sendKeys("Abcd@gmail.com");
	//WebElement user1 = driver.findElement(By.id("pass"));
	//user1.sendKeys("ac12&");
	//WebElement log_in = driver.findElement(By.id("loginbutton"));
	//log_in.click();
}
}


