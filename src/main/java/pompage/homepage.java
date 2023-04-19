package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(xpath = "//img[@alt=\"Guru99 Demo Sites\"]")
	private WebElement logo;
	@FindBy(xpath = "//td[contains(text(),'Manger')]")
	private WebElement managerid;
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logout;
	
	//intilization
	public homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getlogo() {
		return logo;
	}
	public String getmanagerid() {
		return managerid.getText();
	}
	public void clicklogout() {
		logout.click();
	}
	

}
