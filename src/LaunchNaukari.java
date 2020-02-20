import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNaukari {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get ("https://www.naukri.com/");
	Thread.sleep(2000);
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	Set<String> wins = driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<>(wins);
	for (int i= al.size()-1; i>=0; i--)
	{driver.switchTo().window(al.get(i));
	Thread.sleep(2000);
	driver.close();
	}
	//wins.remove (parent); remove parent from set
	//System.out.println(wins.getClass());
	//for (String win: wins) {
		//System.out.println(win);
		//driver.switchTo().window(win); change focus to set
		//driver.close();
	}
}


