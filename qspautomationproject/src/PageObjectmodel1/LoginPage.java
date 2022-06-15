package PageObjectmodel1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	
	
	
	
	
	public WebElement getUsn() {
		return usn;
		
	}
	public WebElement getPass() {
		return pass;
		
	}
	public WebElement getLoginBtn() {
		return loginBtn;
		
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
		
	}
	public WebElement getLogo() {
		return logo;
		
	}
	public WebElement getLicenseLink() {
		return licenseLink;
		
	}
	
	public void actiTimevalidLogin(String validUsername, String validPassword)
	
	{
		
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


