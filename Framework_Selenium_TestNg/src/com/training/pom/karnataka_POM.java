package com.training.pom;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class karnataka_POM {
	private WebDriver driver; 
	
	public karnataka_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
//   locating webElement
	@FindBy(css = "span.mkdf-side-menu-icon")
//	 creating variable for webElement
	private WebElement HamMenu; 
	
	@FindBy(css = "a[href=\"https://karnatakatourism.org/contact-us/\"]")
//	for click on contact Us
	private WebElement contactUs;

	
	@FindBy(xpath = "(//span[@class=\"mkdf-icon-font-elegant icon_search \"])[2]")
	private WebElement searchIcon; 
	
	
	@FindBy(css = "input[placeholder=\"Search for...\"]")
	private WebElement typeText;
	
	
	
	@FindBy(css = "[href='tel\\:\\+91-80-2235-2828 ']")
	private WebElement phoneLink;
	
	
	@FindBy(xpath = "(//a[@href=\"mailto:feedback@karnatakatourism.org\"])[3]")
	private WebElement mailLink;
	
	
	
	@FindBy(css = ".mkdf-icon-stack")
	private WebElement goUpBtn;
	
	
	@FindBy(css = "h1[class=\"mkdf-page-title entry-title\"]")
	private WebElement PageText;
	
	
	
	@FindBy(xpath = "(//a[@href=\"https://www.facebook.com/KarnatakaWorld/\"])[2]")
	private WebElement fbLink;
	
	@FindBy(xpath = "//h1[@class=\"x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz\"]")
	private WebElement fbText;
	
//	creating function for commands
	public void clickonHam() {
		this.HamMenu.click() ;
	}
	
	
	
	public void clickOnContactUs() {
		this.contactUs.click();
	}
	
	
	public void clickOnSearchIcon() { 
		this.searchIcon.click();
	}
	
	
	public void keyPress(int s) throws AWTException {
		Robot r = new Robot();
		r.keyPress(s);
	}
	
	
	public void typeSearch(String s) {
		this.typeText.sendKeys(s);
	}
	
	
	public void clickOnPhone()  {
		this.phoneLink.click();
	}
	
	
	public void alertText() {
		driver.switchTo().alert().accept();
	}
	
	public void clickOnMail() {
		this.mailLink.click();
	}
	
	public void clickOnGoUpBtn() {
		this.goUpBtn.click();
	}
	
	
	public String getTextPage () {
		return this.PageText.getText();
	}
	
	public void clickOnFbLink() {
		this.fbLink.click();
	}
	
	public String getFbText() {
		return this.fbText.getText();
	}
	
	
	
	
}
