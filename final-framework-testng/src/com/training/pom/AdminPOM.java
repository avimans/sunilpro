package com.training.pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

import bsh.This;

public class AdminPOM {
	WebDriver driver;
	public AdminPOM (WebDriver driver6) {
		this.driver = driver6;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement admin;
	public void admin1() throws InterruptedException {
		this.admin.click();
		Thread.sleep(2000);
	}
	@FindBy(id = "menu_admin_Job")
	private WebElement addjob;
	public void addjob1() throws InterruptedException {
		this.addjob.click();
		Thread.sleep(2000);
		Select sel1 = new Select(addjob);
        	sel1.selectByValue("Job Titles");
        	Actions act1 =new Actions(driver);
    		act1.click().build().perform();
	}

}
