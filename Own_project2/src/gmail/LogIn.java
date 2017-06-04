package gmail;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {
	
     public static void main(String[] args)  {
	
System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/gmail/about/");

driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
driver.findElement(By.id("identifierId")).sendKeys("pallavidash92");

}
}