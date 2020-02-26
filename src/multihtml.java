import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multihtml {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/multi.html");
		WebElement ele = driver.findElement(By.id("b"));
		Select s = new Select(ele);
		List<WebElement> vals = s.getOptions();
		if (s.isMultiple()) {
			/*
			 * for (WebElement val : vals) { s.selectByValue(val.getText());
			 * Thread.sleep(1000); }
			 */
			for (int i = 0; i < vals.size(); i++) {
				s.selectByIndex(1);
				s.selectByIndex(3);
			}

			System.out.println("=========================");
			List<WebElement> opts = s.getAllSelectedOptions();
			for (WebElement opt : opts) {
				System.out.println(opt.getText());

			}
			System.out.println("++++++++");
			System.out.println(s.getFirstSelectedOption().getText());
			Thread.sleep(1000);
			// s.deselectAll();

		}
	}
}