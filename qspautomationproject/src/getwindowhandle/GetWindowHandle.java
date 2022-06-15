package getwindowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetWindowHandle {
	
	
	public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://flipkart.com/");
	driver.findElement(By.xpath("//button[.='x']")).click;
    driver.findElement(By.name(//button[@class='L0Z3Pu'])).syntax(samsungf12 mobile);
    		
    Thread.sleep(4000)
	
	
	
	
	
	
	

