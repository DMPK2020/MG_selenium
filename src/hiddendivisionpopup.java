import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[3]/descendant::div[@class='menu_icon']")).click();
		//driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		//System.out.println(driver.findElement(By.xpath("//td[@class='aboutCopyright']")).getText());
		driver.findElement(By.xpath("//a[text()='Contact actiTIME Support']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='inputContainer']/textarea")).getAttribute("placeholder"));
}
}