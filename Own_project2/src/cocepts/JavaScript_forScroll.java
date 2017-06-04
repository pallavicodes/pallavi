package cocepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_forScroll {


	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.guru99.com/execute-javascript-selenium-webdriver.html");
		driver.manage().window().maximize();
		
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)"," ");
    	driver.findElement(By.xpath("//*[text()='executeScript']"));
		
	}
}
