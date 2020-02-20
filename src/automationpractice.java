import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement text = driver.findElement(By.xpath("//td[@id='headerContainer']"));
    String S1= text.getText();
    System.out.println(S1);
	WebElement usn = driver.findElement(By.xpath("//td/table[1]/tbody/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"));
	usn.sendKeys("admin");
	WebElement pwd = driver.findElement(By.xpath("//td/table[1]/tbody/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"));
	pwd.sendKeys("manager");
	WebElement logbutn =driver.findElement(By.xpath("//tr/td[3]/a[1]/div"));
	logbutn.click();
}
}
