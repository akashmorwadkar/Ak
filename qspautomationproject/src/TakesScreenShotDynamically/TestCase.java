package TakesScreenShotDynamically;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest {
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
  @Test
  public void validLogin() 
  {
	  SoftAssert softAssert = new SoftAssert();
	 String actualLoginPageTitle=driver.getTitle();
	 softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM");
	 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.name("txtPassword")).sendKeys("akash");
	 driver.findElement(By.)
	  
  }
}
