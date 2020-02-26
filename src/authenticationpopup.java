import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationpopup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String user = "admin";//read from excel
	String pass = "admin";
	String url = "https://" + user+ ":"+ pass +"@the-internet.herokuapp.com/basic_auth";
	driver.get(url);
}
}
