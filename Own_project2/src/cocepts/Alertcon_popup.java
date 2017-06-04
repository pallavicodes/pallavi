package cocepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertcon_popup {
	public static void main(String[] args) {
		
	
	 System.setProperty("webdriver.gecko.driver","D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String alertMsg=alt.getText();
		System.out.println(alertMsg);
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		
		alt.dismiss();
		System.out.println("clicked cancel button");

}
}
