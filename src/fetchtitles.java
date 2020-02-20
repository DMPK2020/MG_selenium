import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchtitles {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get ("https://www.naukri.com/");
			Thread.sleep(2000);
			Set<String> wins = driver.getWindowHandles();
			for (String win:wins) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
			}
		}
}