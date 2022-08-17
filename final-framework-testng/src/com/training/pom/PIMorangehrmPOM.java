package com.training.pom;



import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import bsh.Primitive;


public class PIMorangehrmPOM {
	WebDriver driver;
	public PIMorangehrmPOM(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver3, this);
		
	}
	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement pim;
	public void pim1() {
		this.pim.click();
		
	}
	@FindBy(id = "menu_pim_addEmployee")
	private WebElement addemployee;
	public void addemployee1() {
		this.addemployee.click();
	}	
	@FindBy(id = "firstName")
	private WebElement firstname;
	public void firstname1() {
		this.firstname.sendKeys("Avinashh",Keys.ENTER);
	}
	@FindBy(id = "lastName")
	private WebElement lastname;
	public void lastname1() {
		this.lastname.sendKeys("B",Keys.ENTER);
	}
	
	
	@FindBy(id="btnSave")
	private WebElement savebtn;
	public void savebtn1() {
		this.savebtn.click();
	}
	@FindBy(id ="btnSave")
	private WebElement editbtn;
	public void editbtn1() {
		this.editbtn.click();
	}
	@FindBy(id = "personal_DOB")
	private WebElement dob;
	public void dob1() throws InterruptedException {
		Thread.sleep(3000);
		this.dob.clear();
		this.dob.sendKeys("2022-07-05",Keys.ENTER);
	}
	@FindBy(id = "btnSave")
	private WebElement editsavebtn;
	public void editsavebtn1() {
		this.savebtn.click();
	}
	
	@FindBy(xpath = "//body/div[1]/div[3]/div/div[1]/ul/li[2]")
	private WebElement contactdetails;
	public void contactdetails1() {
		this.contactdetails.click();
	}
	@FindBy(id = "btnSave")
	private WebElement contacteditbtn;
	public void contacteditbtn1() {
		this.contacteditbtn.click();
	}
	@FindBy(id="contact_street1")
   private WebElement address;
	public void adress1() {
		this.address.sendKeys("india",Keys.ENTER);
	}
	@FindBy(id = "btnSave")
	private WebElement contactdetailssavebtn;
	public void contdetailssavebtn1() {
		this.contactdetailssavebtn.click();
	}
	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/ul/li[6]")
    private WebElement job;
	public void job1() {
		this.job.click();
	}
	@FindBy(id = "btnSave")
	private WebElement jobeditbtn;
	public void jobedit1btn1() {
		this.jobeditbtn.click();
	}
	@FindBy(id = "job_job_title")
	private WebElement jobtitle;
	public void jobtitle1() throws InterruptedException {
		this.jobtitle.click();
	
	Select dc = new Select(jobtitle);
	Thread.sleep(2000);
	dc.selectByVisibleText("Automation Tester");
	}
	@FindBy(id = "btnSave")
	private WebElement jobsavebtn;
	public void jobsavebtn1() {
		this.jobsavebtn.click();
	}
	
}


