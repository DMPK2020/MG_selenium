import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(9000);
		WebElement cls_child = driver.findElement(By.xpath ("//a[@class='close-reveal-modal hide-mobile']"));
		cls_child.click();
		WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		System.out.println(sale.getText());
		WebElement dine = driver.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		System.out.println(dine.getText());
		WebElement bedrm = driver.findElement(By.xpath("//li[@class='topnav_item bedroomunit']"));
		System.out.println(bedrm.getText());
		WebElement liv = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
		System.out.println(liv.getText());
		WebElement stor = driver.findElement(By.xpath("//li[@class='topnav_item storageunit']"));
		System.out.println(stor.getText());
		WebElement study = driver.findElement(By.xpath("//li[@class='topnav_item studyunit']"));
		System.out.println(study.getText());
		WebElement mat = driver.findElement(By.xpath("//li[@class='topnav_item mattressesunit']"));
		System.out.println(mat.getText());
		WebElement decor = driver.findElement(By.xpath("//li/span[contains(.,'Decor')]"));
		System.out.println(decor.getText());
		WebElement nw = driver.findElement(By.xpath("//li[@class='topnav_item newunit']"));
		System.out.println(nw.getText());
		WebElement cls = driver.findElement(By.xpath("//li/span[contains(.,'Collections')]"));
		System.out.println(cls.getText());
		
		
	}		
}
