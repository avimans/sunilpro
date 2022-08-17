 package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginorangehrmpom {
 WebDriver driver;
	public Loginorangehrmpom(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver1, this);
	}
	@FindBy(id="txtUsername")
	private WebElement username;
	
	public void username1(String username) {
		this.username.clear();
		this.username.sendKeys(username);
		
	}
	
	@FindBy(id="txtPassword")
	private WebElement Password;
	
	public void Password1(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
		
      }
	@FindBy(id="btnLogin")
	WebElement button;
	public void button1() {
		this.button.click();
	}
}
