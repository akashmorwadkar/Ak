package TestAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DataProviderCode {
  WebDriver driver;
  
  @BeforeMethod
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("http://127.0.0.1/login.do;jsessionid=2cgwrtdhrc674");
	  
  }
  
  @DataProvider(name="testActiTimeData")
  public Object[][] dataprovider()
  {
	  Object[][] data=new Object[5][2];
	  
	  data[0][0]="admin"
	  data[0][1]="manager123";
	  
	  
	  
	return null;
	  
  }
  
  
  
  @Test
  public void f() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
