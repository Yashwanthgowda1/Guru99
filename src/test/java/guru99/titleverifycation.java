package guru99;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_library.Baseclass;
@Test
public class titleverifycation extends Baseclass {
	public void test1() throws InterruptedException {
		SoftAssert soft=new SoftAssert();
		login.setuserId(excel.readData("Sheet1", 0, 1));
		login.setpassword(excel.readData("Sheet1", 1, 1));
		login.clicklogin();

	web.explicitlywait(time, "Guru99 Bank Manager HomePage");
soft.assertAll();	
	
		
		

}
}
