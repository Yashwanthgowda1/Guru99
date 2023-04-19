package generic_library;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompage.homepage;
import pompage.loginpage;


public class Baseclass {
protected	WebDriverutility web;
protected  ExcelFileutility excel;
protected Propertyfileutility property;
protected JavaUtility junit;
protected WebDriver driver;
protected loginpage login;
protected homepage home;
protected  long  time;

	@BeforeClass
	public void oprnbrowser() {
		 web=new WebDriverutility();
		  excel=new ExcelFileutility();
		   property=new Propertyfileutility();
		    junit=new JavaUtility();
		    property.propertyconfg(Iconsatntpath.PROPerties_FILE);
		  String url=  property.fetchproperty("url");
		  String browser=property.fetchproperty("browser");
		  String time1=property.fetchproperty("time");
		 time=Long.parseLong(time1);
		  driver=web.openApplication(browser, url, time);
	}
		  @BeforeMethod
		  public void logintoapplication() {
			  	login=new loginpage(driver);
			  	excel.reintilization(Iconsatntpath.EXCEL_FILE);
			  	
			  	home=new  homepage(driver);
			  	Assert.assertTrue(login.getlogo().isDisplayed());
			  	



			  
		  }
		  @AfterMethod
		  public void close() {
		excel.closeWorkBook();
		  }
		  @AfterClass
		  public void quite(){
			 web.quitBrowser();
			  
		  }
		  
		  
		  
		  
		 
	
	}


