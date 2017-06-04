package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Logout {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:/workspace/Own_project2/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	WebElement emailTxtBox=driver.findElement(By.xpath("//*[@id='email']"));
	emailTxtBox.sendKeys("8594919532");
	
	WebElement passwordTxtBox=driver.findElement(By.xpath("//*[@id='pass']"));
	passwordTxtBox.sendKeys("kirankanti233");
	
	WebElement loginBtn=driver.findElement(By.id("u_0_q"));
	loginBtn.click();

	WebElement symbBtn=driver.findElement(By.id("userNavigationLabel"));
	symbBtn.click();
	/*JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", symbBtn);*/
	
    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

    driver.findElement(By.partialLinkText("Log out")).click();

    System.out.println("Log out");

   }
	
}
