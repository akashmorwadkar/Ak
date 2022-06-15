package Assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class senario2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/webpage");
		Thread.sleep(5000);
		WebElement driver1 findElement(By.xpath("//p[.='Drag me to my target']"));
		
		WebElement target = driver1.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions act = new Actions((WebDriver) driver1);
		act.dragAndDrop(src, target).perform();
		

	}

	private static void findElement(By xpath) {
		// TODO Auto-generated method stub
		
	}

}
