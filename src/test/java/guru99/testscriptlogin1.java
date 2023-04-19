package guru99;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_library.Baseclass;

public class testscriptlogin1 extends Baseclass {
@Test
public void test1() {
	SoftAssert soft=new SoftAssert();
//	Map< String, String>map=excel.readdata("Sheet1");

//	login.clicklogin();
//	login.setuserId("UserId");
//	login.setpassword(" ");
		login.setuserId(excel.readData("Sheet1", 0, 1));
	login.setpassword(excel.readData("Sheet1", 1, 1));
	login.clicklogin();
	soft.assertAll();
	
}
}
