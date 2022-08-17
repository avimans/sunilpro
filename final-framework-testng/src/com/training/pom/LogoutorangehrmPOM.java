package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutorangehrmPOM {
	WebDriver driver;
	public LogoutorangehrmPOM(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}
	@FindBy(id="welcome")
	private WebElement welcomebutton;
    
	public void welcome1 () {
		this.welcomebutton.click();
		
	}
	@FindBy(xpath = "//*[@id='welcome-menu']/ul/li[3]/a")
	private WebElement logoutbutton;
	public void logout1() {
		this.logoutbutton.click();
	}

}
