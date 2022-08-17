package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.logoutpom;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private static WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private logoutpom logoutelr;
	private static Properties properties;
	//private ScreenShot screenShot;

	@BeforeTest
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);

	
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		logoutelr = new logoutpom(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("Pradeep_20");
		loginPOM.sendPassword("Pradeep123");
		loginPOM.clickLoginBtn(); 
		//screenShot.captureScreenShot("First");
		
	}
	@Test
	public void logout() {
		logoutelr.clickLogoutBtn();
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	
}
