package cocepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	driver.manage().window().maximize();
	//to get the url
	driver.navigate().to("https://www.google.com/gmail/about/");
	//to refresh
	driver.navigate().refresh();
	driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
	
	
	//driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/content/span")).click();
	driver.navigate().back();
	//driver.navigate().forward();
	//driver.findElement(By.id("identifierId")).sendKeys("pallavidash92");
	

}
}
