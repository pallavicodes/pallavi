package facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_FF {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "D://workspace//Own_project2//Drivers//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailTxtboxLoc=driver.findElement(By.xpath(".//*[@id='email']"));
		emailTxtboxLoc.sendKeys("pallavidash92@gmail.com");
		
		WebElement passwordTxtbox=driver.findElement(By.xpath(".//*[@id='pass']"));
		passwordTxtbox.sendKeys("pallavi@123");
	
		WebElement loginbutton=driver.findElement(By.xpath(".//*[@id='u_0_q']"));
		loginbutton.click();
		
		
		
		/*WebElement forgottonPaswordButton=driver.findElement(By.xpath(""));
		forgottonPaswordButton.click();
		*/
		
	}
}
