package com.training.pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bsh.This;

public class DirectoryPOM {
	WebDriver driver;
	public DirectoryPOM(WebDriver driver5) {
	this.driver=driver5;
	PageFactory.initElements(driver,this);
	}
	@FindBy(id = "menu_directory_viewDirectory")
	private WebElement directoryy;
	public void directory1() {
		this.directoryy.click();
	}
	@FindBy(id = "searchDirectory_emp_name_empName")
	private WebElement searchdirectory;
	public void searchdirectory1() {
		this.searchdirectory.sendKeys("Avinash B",Keys.ENTER);
	}
	@FindBy(id = "searchDirectory_job_title")
	private WebElement jobtitle;
	public void jobtitle1() {
		this .jobtitle.click();
	
		Select job = new Select(jobtitle);
		job.selectByIndex(1);
		Actions act1 =new Actions(driver);
		act1.click().build().perform();
		}
	@FindBy(id = "searchBtn")
private WebElement searchbtn;
	public void searchbtn1() {
		this.searchbtn.click();
	}
}
