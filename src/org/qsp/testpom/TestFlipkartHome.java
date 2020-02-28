package org.qsp.testpom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.qsp.pom.FlipkartHome;

public class TestFlipkartHome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		FlipkartHome fl = new FlipkartHome(driver);
		fl.clPopup();
		Actions a = new Actions(driver);
		a.moveToElement(fl.menu).build().perform();
		fl.selectPro();
		fl.selectFirst();
		Set<String> win1 = driver.getWindowHandles();
		   for (String win:win1) {
				driver.switchTo().window(win);
		   }
		fl.bClick();
		
		
		
		
		

}
}