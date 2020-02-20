import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTIME {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//String S1=driver.getTitle();
	WebElement user = driver.findElement(By.name("username"));
	user.sendKeys("admin");
	WebElement pass = driver.findElement(By.name("pwd"));
	pass.sendKeys("manager");
	WebElement log_in = driver.findElement(By.id("loginButton"));
	log_in.click();
	//String S2=driver.getTitle();
	WebDriverWait ww = new WebDriverWait(driver, 10);
	ww.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
	driver.findElement(By.id("logoutLink")).click();
	
}
}
