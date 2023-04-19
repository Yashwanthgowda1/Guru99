package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	/**
	 * @findby method used to fetch the object
	 */
	@FindBy(xpath = "//img[@alt=\"Guru99 Demo Sites\"]")
	private WebElement logo;
	@FindBy(xpath = "//a[text()='Testing']")
	private WebElement Testinglink;
	@FindBy(xpath = "//a[text()='Selenium']")
	private WebElement Seleniumlink;
	@FindBy(xpath = "//a[text()='Live Project']")
	private WebElement liveprojectlink;
	@FindBy(xpath = "//a[text()='Java']")
	private WebElement java;
//	@FindBy(xpath = "//li[@class=\"dropdown\"]")
//	private WebElement seleniumdropdown;
	@FindBy(xpath = "//a[text()=\"Insurance Project\"]")
	private WebElement Insurance_Project;
	@FindBy(xpath = "//a[text()=\"Agile Project\"]")
	private WebElement Agile_Project;
//	@FindBy(xpath = "//li[@class=\"dropdown\"]/a[text()=\"Bank Project\"]")
//	private WebElement Bankprojectdropdown;
	@FindBy(xpath = "//li[@class=\"dropdown\"]/a[text()=\"Security Project\"]")
	private WebElement Security_Projectlink;
	@FindBy(xpath = "//li[@class=\"dropdown\"]/a[text()=\"Telecom Project\"]")
	private WebElement Telecom_Projectlink;
	@FindBy(xpath = "//li[@class=\"dropdown\"]/a[text()=\"Payment Gateway Project\"]")
	private WebElement Payment_Gateway_Projectlink;
	@FindBy(xpath = "//li[@class=\"dropdown\"]/a[text()=\"New Tours\"]")
	private WebElement NewTourelink;
//	@FindBy(xpath = "//li[@class=\"dropdown\"]/a[contains(text(),\"SEO\")]")
//	private WebElement SEOdropdown;

	@FindBy(xpath = "//input[@name=\"uid\"]")
	private WebElement userId;
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;
	@FindBy(xpath = "//input[@type=\"submit\"] ")
	private WebElement login;
	@FindBy(xpath = "//input[@type=\"reset\"]")
	private WebElement reset;
	@FindBy(xpath = "//a[text()=\"here\"]")
	private WebElement vistherelink;

//intilization
	/**
	 * this method is used to handelstale element referance exception
	 * 
	 * @param driver
	 */
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//utilization
	/**
	 * this methos are used to click and verify and sendkeys action can be perform
	 * 
	 * @return
	 */
	public WebElement getlogo() {
		return logo;

	}

	public void clickTestinglink() {
		Testinglink.click();
	}

	public void clickSeleniumlink() {
		Seleniumlink.click();
	}

	public void clickliveprojectlink() {
		liveprojectlink.click();
	}

	public void clickjava() {
		java.click();
	}

//	public void seleniumdropdown() {
//		seleniumdropdown.click();
//	}

	public void clickInsurance_Project() {
		Insurance_Project.click();
	}

	public void clickAgile_Project() {
		Agile_Project.click();
	}

//	public void Bankprojectdropdown() {
//		Bankprojectdropdown.click();
//	}

	public void clickSecurity_Projectlink() {
		Security_Projectlink.click();
	}

	public void clickTelecom_Projectlink() {
		Telecom_Projectlink.click();
	}

	public void clickPayment_Gateway_Projectlink() {
		Payment_Gateway_Projectlink.click();
	}

	public void clickNewTourelink() {
		NewTourelink.click();
	}

//	public void SEOdropdown() {
//		SEOdropdown.click();
//	}

	public void setuserId(String element) {
		userId.sendKeys(element);

	}


	public void setpassword(String pass) {
		password.sendKeys(pass);
	}

	public void clicklogin() {
		login.click();
	}

	public void clickreset() {
		reset.click();

	}

	public void clcikvistherelink() {
		vistherelink.click();

	}

}
