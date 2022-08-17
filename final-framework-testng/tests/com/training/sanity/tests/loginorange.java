package com.training.sanity.tests;

import org.testng.annotations.Test;


import com.training.pom.Loginorangehrmpom;
import com.training.pom.LogoutorangehrmPOM;
import com.training.pom.PIMorangehrmPOM;
import com.training.pom.AdminPOM;
import com.training.pom.DashboardorangehrmPOM;
import com.training.pom.DirectoryPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class loginorange {
	private WebDriver driver;
	private String baseUrl;
	private Loginorangehrmpom loginorangee;
	private AdminPOM Admin;
	private LogoutorangehrmPOM logoutorange;
	private PIMorangehrmPOM pimorange;
	private DashboardorangehrmPOM dashboardd;
	private DirectoryPOM directoryyy;
	
	private static Properties properties;
	
	    @BeforeTest
	    public void beforeTest() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);

		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginorangee = new Loginorangehrmpom(driver);
		Admin        = new AdminPOM(driver);
		pimorange    = new PIMorangehrmPOM(driver);
		dashboardd   = new DashboardorangehrmPOM(driver);
		directoryyy  = new DirectoryPOM(driver);
	  //logoutorange = new LogoutorangehrmPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
	  }
	
//================logigng in========================================	
  @Test (priority = 0)
  public void login() {
	  loginorangee.username1("Admin");
	  loginorangee.Password1("admin123");
	  loginorangee.button1();
  }
//=======================in admin adding a new job title=====================  
  
  @Test(priority = 1)
  public void Admin() throws InterruptedException {
	  Admin.admin1();
	  Thread.sleep(3000);
	  Admin.addjob1();
	  
  }
  
//==================CREATING A NEW USER AND ADDING PERSONAL DETAILS======== 
   @Test (priority = 2) 
   public void pim() throws InterruptedException {
	   Thread.sleep(3000);
	   pimorange.pim1();
	   pimorange.addemployee1();
	   pimorange.firstname1();
	   pimorange.lastname1();
	   pimorange.savebtn1();
	   pimorange.editbtn1();
	   pimorange.dob1();
	   pimorange.editsavebtn1();
	   pimorange.contactdetails1();
	   pimorange.contacteditbtn1();
	   pimorange.adress1();
	   pimorange.contdetailssavebtn1();
	   pimorange.job1();
	   pimorange.jobedit1btn1();
	   pimorange.jobtitle1();
	   pimorange.jobsavebtn1();
	   Thread.sleep(2000);
	   
	  }
   
//================APPLYING FOR A LEAVE=================================== 
   @Test (priority = 3)
   public void dash() throws InterruptedException {
	   dashboardd.dashboard1();
	   dashboardd.applyleave1();
	   dashboardd.addname1();
	   dashboardd.leavetype1();
   }
//==========================searching for a profile=======================  
   @Test (priority = 4)
   public void directoryy() {
	   directoryyy.directory1();
	   directoryyy.searchdirectory1();
	   directoryyy.jobtitle1();
	   directoryyy.searchbtn1();
   }
   
   
////==============================================================   
//   @Test (enabled=false)
//   public void logout() throws InterruptedException {
// 	  logoutorange.welcome1();
// 	  Thread.sleep(3000);
// 	  logoutorange.logout1();
//   }
  

  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

}
