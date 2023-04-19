package guru99;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_library.Baseclass;

public class testscriptinavilddata extends Baseclass{
	@Test
	
public void test1() throws InterruptedException {
		SoftAssert soft=new SoftAssert();
		/**
		 * invalid username valid password test scripts
		 */
		login.setuserId(excel.readData("Sheet2", 0, 1));
		login.setpassword(excel.readData("Sheet2", 1, 1));
		login.clicklogin();
//	soft.assertEquals(web.handelpops(), "User or Password is not valid");
//	soft.assertEquals(web.handelpops(), "User or Password is not valid ");
//		web.handelAlertpops("gettext", null);
		
		
		
		soft.assertEquals(web.handelpops(), "User or Password is not valid");
		web.handelAlertpops("ok", null);
//	web.explicitWait(login.getlogo(), 10);
		web.navigationrefresh();
		
		
		
		login.setuserId(excel.readData("Sheet2", 2, 1));
		login.setpassword(excel.readData("Sheet2", 3, 1));
		login.clicklogin();
		
		soft.assertEquals(web.handelpops(), "User or Password is not valid");
		soft.assertAll();
		
		
		
	}
}
