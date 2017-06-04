package cocepts;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.gargoylesoftware.htmlunit.javascript.configuration.JavaScriptConfiguration;

public class JavaScript_executerfor_click {
	
	
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.google.com/gmail/about/");
	driver.manage().window().maximize();
	
	WebElement signIn=driver.findElement(By.xpath("html/body/nav/div/a[2]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", signIn);
}
}
