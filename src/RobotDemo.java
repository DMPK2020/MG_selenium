import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);*/
		Robot r = new Robot();
		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		search.sendKeys("Java");
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		Robot q = new Robot();
		WebElement copy = driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt i8lZMc']/span"));
		a.doubleClick(copy).perform();
		q.keyPress(KeyEvent.VK_CONTROL);
		q.keyPress(KeyEvent.VK_C);
		q.keyRelease(KeyEvent.VK_C);
		q.keyRelease(KeyEvent.VK_CONTROL);
		Robot p = new Robot();
		p.keyPress(KeyEvent.VK_CONTROL);
		p.keyPress(KeyEvent.VK_T);
		p.keyRelease(KeyEvent.VK_T);
		p.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		Robot k = new Robot();
		k.keyPress(KeyEvent.VK_CONTROL);
		k.keyPress(KeyEvent.VK_V);
		k.keyRelease(KeyEvent.VK_V);
		k.keyRelease(KeyEvent.VK_CONTROL);
		Robot l = new Robot();
		l.keyPress(KeyEvent.VK_ENTER);
		
}
}