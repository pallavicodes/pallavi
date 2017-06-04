package cocepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaSript_for_text {
	
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.google.com/gmail/about/");
	driver.manage().window().maximize();
	
	WebElement signIn=driver.findElement(By.xpath("html/body/nav/div/a[2]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", signIn);
	//WebElement email=driver.findElement(By.xpath("//input[@id='identifierId']"));
    JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("document.getElementById('identifierId').value='pallavidash@gmail.com';");
}
}
