package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sign_up {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.flipkart.com/");
		
	WebElement signUpButton=driver.findElement(By.xpath("//a[@text='signup']"));
	signUpButton.click();
	
	WebElement mobileNoTxtBox=driver.findElement(By.xpath("//input[@class='_2zrpKAtqH0O2AkjJPXnqu9']"));
	mobileNoTxtBox.sendKeys("8249123089");
	
	WebElement continueTxtBox=driver.findElement(By.xpath("//button[@class='_2AkmmACqEoGpO0Lb0CP5qw _1LctnI5odiL0RXoz8QG7f- _7UHT_c6I0rNPYxrgQM_qC']"));
	continueTxtBox.click();
	
	// sgk=driver.findElement(By.id)
	
	
	
	
	
	}

	
	
}
