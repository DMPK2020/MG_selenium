import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select (day);
		List<WebElement> days = s.getOptions();
		for (WebElement all : days) {
			System.out.println(day.getText());
		}
		
		 /*WebElement day = driver.findElement(By.xpath("//select[@id='day']")); dropdown list 
		 Select s = new Select (day);
		 s.selectByValue("11");
		 WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select (month);
		s1.selectByIndex(1);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select (year);
		s2.selectByVisibleText("2020");*/
	
		/*WebElement label = driver.findElement(By.xpath("//label[text()='Email or phone']")); login and password
		String Lb= label.getText();
		WebElement label1 = driver.findElement(By.xpath("//label[text()='Password']"));
		String Lb1 = label1.getText();
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(Lb);
		WebElement pswd = driver.findElement(By.xpath("//input[@id='pass']"));
		pswd.sendKeys(Lb1, Keys.ENTER);*/
		
		
	}
}
