package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHome {
@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
private WebElement adv;
@FindBy(xpath="//span[contains(.,'Electronics')]")
public WebElement menu;
@FindBy(xpath="//li[contains(.,'Electronics')]/descendant::a[text()='Mi']")
private WebElement mi;
@FindBy(xpath="//div[@class='_1HmYoV _35HD7C']/div[2]")
private WebElement first;
@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
private WebElement addCart;

public FlipkartHome(WebDriver driver) {
	PageFactory.initElements(driver, this);

}

public void clPopup (){
	adv.click();
}
public void selectPro(){
	mi.click();
}

public void selectFirst(){
	first.click();
	
}

public void bClick() {
	addCart.click();
}













}