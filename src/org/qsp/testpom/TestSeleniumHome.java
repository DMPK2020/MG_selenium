package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeleniumHome;

public class TestSeleniumHome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	SeleniumHome sh = new SeleniumHome(driver);
	sh.sendText("tshirt");
	sh.bClick();
	driver.navigate().back();
	sh.sendText("shoes");
	sh.bClick();
	
	
	
	
	
	
}
}
