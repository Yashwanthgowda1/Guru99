package guru99;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_library.Baseclass;

public class homepageverifiactionmanger extends Baseclass {
	@Test
	public void test1() throws InterruptedException {
	SoftAssert soft=new SoftAssert();
	

	login.setuserId(excel.readData("Sheet1", 0, 1));
	login.setpassword(excel.readData("Sheet1", 1, 1));
	login.clicklogin();

	soft.assertTrue(home.getlogo().isDisplayed());
	home.getmanagerid();
	Thread.sleep(1000);
	soft.assertEquals(home.getmanagerid(), "Manger Id : mngr492652");
	web.takeScreenShots(junit);
	
	soft.assertAll();
	
		
	}

}
