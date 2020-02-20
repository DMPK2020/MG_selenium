import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoactiTM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//b[text()='admin']"));
		String S1= user.getText();
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys(S1);
		WebElement user1 = driver.findElement(By.xpath("//b[text()='manager']"));
		String S2= user1.getText();
		WebElement pswd =driver.findElement(By.xpath("//input[@name='pwd']"));
		pswd.sendKeys(S2, Keys.ENTER);
	
	}		
}
