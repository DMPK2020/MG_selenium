package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SeleniumHome {
	@FindBy(xpath = "//input[@name='search_query']")
	private WebElement search;
	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement sButton;

	public SeleniumHome(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void sendText(String text) {
		search.sendKeys(text);
	}

	public void bClick() {
		sButton.click();
	}

}
