package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.karnataka_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import common.Assert;

public class KarnatkaTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private karnataka_POM karnataka_POM ;
	private static Properties properties;
	private ScreenShot screenShot;
	private String searchText = "Beach";
	
	
	
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		
//	}
//	
	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		karnataka_POM = new karnataka_POM(driver) ;
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);

		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
//	@Test
//	public void validLoginTest() {
//		loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
//	}
	
	@Test(enabled = false)
	public void testingSearchIcon__TC01 () throws AWTException, InterruptedException {
		karnataka_POM.clickonHam();

		karnataka_POM.clickOnContactUs();
		
		for(int i=0;i<5;i++) {
			karnataka_POM.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
		}

		karnataka_POM.clickOnSearchIcon();

		karnataka_POM.typeSearch(searchText);
		Thread.sleep(2000);
		karnataka_POM.keyPress(KeyEvent.VK_ENTER);

//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		driver.manage().timeouts().wait(4000);
		
		Thread.sleep(5000);
		

		assertEquals(driver.getCurrentUrl(), ("https://karnatakatourism.org/?s="+searchText));
		
	}
	
	@Test(enabled = false)
	public void chekPhoneLink___TC02() throws Exception { 
		karnataka_POM.clickonHam();

		karnataka_POM.clickOnContactUs();
		
		
		for(int i=0;i<10;i++) {
			karnataka_POM.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
		}
		
		karnataka_POM.clickOnMail();
//		karnataka_POM.clickOnPhone();
		Thread.sleep(2000);
//		karnataka_POM.alertText();
//		driver.switchTo().alert().accept();
		
		
//		System.out.println();
		
	}
	
	
	@Test(enabled = false)
	public void checkFeedbackLink___TC03() throws Exception { 
		karnataka_POM.clickonHam();

		karnataka_POM.clickOnContactUs();
		
		
		for(int i=0;i<10;i++) {
			karnataka_POM.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
		}
		
		karnataka_POM.clickOnMail();
		Thread.sleep(2000);
//		karnataka_POM.alertText();
//		driver.switchTo().alert().accept();
		
		
//		System.out.println();
		
	}
	
	
	
	@Test(enabled = false)
	public void goUpBtn___TC04() throws Exception {
		karnataka_POM.clickonHam();

		karnataka_POM.clickOnContactUs();
		for(int i=0;i<22;i++) {
			karnataka_POM.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
		}
		
		karnataka_POM.clickOnGoUpBtn();
		Thread.sleep(3000);
		
		
		String s = karnataka_POM.getTextPage();
		
		assertEquals("Contact Us", s);
		
	}
	
	@Test
	public void checkFbLInk___TC05() throws Exception { 
		karnataka_POM.clickonHam();

		karnataka_POM.clickOnContactUs();
		
		for(int i=0;i<13;i++) {
			karnataka_POM.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
		}
		
		karnataka_POM.clickOnFbLink();
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		String curUrl = driver.getCurrentUrl();
		driver.switchTo().window(curUrl);
		System.out.println(driver.getCurrentUrl());
//		System.out.println(karnataka_POM.getFbText());
//		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		
		
		
//		assertEquals(driver.getCurrentUrl() ,"https://www.facebook.com/KarnatakaWorld/" );
	}

}
