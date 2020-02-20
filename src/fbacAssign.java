import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fbacAssign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_m")).sendKeys("manju");
		driver.findElement(By.id("u_0_o")).sendKeys("salunke");
		driver.findElement(By.id("u_0_r")).sendKeys("manjuslnk2020@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("Account@2020");
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_u"))).sendKeys("manjuslnk2020@gmail.com");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select (day);
		s.selectByValue("11");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select (month);
		s1.selectByIndex(1);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select (year);
		s2.selectByVisibleText("2000");
		driver.findElement(By.xpath("//span/span[contains(.,'Female')]")).click();
		driver.findElement(By.xpath("//form/div/div/button[contains(.,'Sign Up')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
}
}