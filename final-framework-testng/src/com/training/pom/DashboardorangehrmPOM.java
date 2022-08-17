package com.training.pom;

import java.awt.Desktop.Action;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import bsh.Primitive;

public class DashboardorangehrmPOM {
WebDriver driver;
 public DashboardorangehrmPOM(WebDriver driver4) {
	 this.driver=driver4;
	 PageFactory.initElements(driver4, this);
 }
 @FindBy(xpath = "//body/div[1]/div[2]/ul/li[8]")
 private WebElement dashboard;
 public void dashboard1() {
//	 WebElement wait = dashboard;
//	 WebDriverWait wt =new WebDriverWait(driver,60);
//	 wt.until(ExpectedConditions.visibilityOf(wait)).click();
	 
	 this.dashboard.click();
 }
 @FindBy(className = "quickLinkText")
 WebElement applyleave;
 public void applyleave1() {
	 this.applyleave.click();
 }
 
 @FindBy(id = "assignleave_txtEmployee_empName")
 WebElement addname;
 
 public void addname1()  {
	 this.addname.sendKeys("Avinashh B",Keys.ENTER);
	 Actions act1 =new Actions(driver);
	 act1.click().build().perform();
	 
	
 }
 
 @FindBy(id ="assignleave_txtLeaveType")
 WebElement leavetype;
public void leavetype1() throws InterruptedException {
	Thread.sleep(2000);
	this.leavetype.click();
	Select sel1 = new Select(leavetype);
	sel1.selectByVisibleText("CAN - Personal");
	Actions act1 =new Actions(driver);
	act1.click().build().perform();
}
}
