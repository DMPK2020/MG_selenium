import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeparentmaxchild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();																												driver.manage().window().maximize();
		driver.get ("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		wins.remove(parent);// parent removed from set
        driver.close();// parent closed0	`
        for (String win : wins) {
		driver.switchTo().window(win); //focus switched to child
		driver.manage().window().maximize();// child maximized
		}
			
	}		
}
