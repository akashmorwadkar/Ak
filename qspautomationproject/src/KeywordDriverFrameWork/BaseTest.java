package KeywordDriverFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	private ChromeDriver driver;

	public void openbrower() throws IOException
	{
		 Flib flib = new Flib();
		  String browservalue=flib.readPropertyFile("./data/config.property","Browser");
		  String url=flib.readPropertyfile(".data/config.property");
		  if(browservalue.equalsIgnoreCase("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		  }
		  else if(browservalue.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get(url);
			  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			  
		  }
		  else
		  {
			  System.out.println("enter the  correct choice");
		  }
		  
	}
public void closebrowser
}
