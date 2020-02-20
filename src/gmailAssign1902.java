import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailAssign1902 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("identifierId")).sendKeys("manjuslnk2020@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.name("password")).sendKeys("Days@2020");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.xpath("//div[text()='Compose']")).click();
	driver.findElement(By.name("to")).sendKeys("manjusalunke147@gmail.com");
	driver.findElement(By.name("subjectbox")).sendKeys("Test Mail");
	driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Test mail.Send via script");
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click(); //send button
	

	
	
	
}
}
