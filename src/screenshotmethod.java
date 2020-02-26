import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class screenshotmethod {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	File screensave = new File("./screenshot/google.png");
	Files.copy(screenshot, screensave);
}
}
