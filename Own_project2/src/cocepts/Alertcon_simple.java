package cocepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Alertcon_simple {
 public static void main(String[] args) {
	 System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();;
		
		Alert alt=driver.switchTo().alert();
		
		String alertMsg=alt.getText();
		System.out.println(alertMsg);
		alt.accept();
		System.err.println("clicked ok button");
		
}
}