import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class findelements {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(9000);
		WebElement cls_child = driver.findElement(By.xpath ("//a[@class='close-reveal-modal hide-mobile']"));
		cls_child.click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuName : menus) {
			String item= (menuName.getText());
			System.err.println (item);
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			screenshot (driver,item);
			List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(., '"+ item +"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for (WebElement names : submenus) {
				System.out.println(names.getText());
		
			}
		}	
	}
				
		public static void screenshot(WebDriver driver, String name) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			File screensave = new File("./screenshot/" +name +".png");
			Files.copy(screenshot, screensave);
			
	}
	//	WebElement sale = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		//Actions b = new Actions(driver);
		//Thread.sleep(2000);
		//b.moveToElement(sale).build().perform();
		//Thread.sleep(6000);
		//List<WebElement> submenu = driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/descendant::ul[@class='taxonslist']/li"));
		//Actions c = new Actions(driver);
		//Thread.sleep(2000);
		//for (WebElement submenus : submenu) {
		//System.out.println(submenus.getText());
		//c.moveToElement(submenus).build().perform();
		//Thread.sleep(2000);//
		}
		
		
