package cocepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ReadData_class {
public static void main(String[] args) throws IOException   {
	
	String cofigfilepath="D:/workspace/Own_project2/config/configfile";
	 
	File f=new File(cofigfilepath);
	 FileInputStream fp=new FileInputStream(f);
	 
	 Properties prop=new Properties();
	 prop.load(fp);
	 
	 String url=prop.getProperty("fburl");
	 String uname=prop.getProperty("fbusername");
	 String password=prop.getProperty("fbpassword");
	 String ffdriver=prop.getProperty("ffpath");
	 String gecko=prop.getProperty("geckoloc");
	 System.out.println(url);
	 System.out.println(uname);
	 System.out.println(password);
	 
	 System.setProperty(gecko,ffdriver);
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get(url);
	 driver.findElement(By.id(Locator.emailId)).sendKeys(uname);
	 driver.findElement(By.id(Locator.passwordId)).sendKeys(password);
     driver.findElement(By.id(Locator.loginid)).click();
     driver.findElement(By.id(Locator.symid)).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.partialLinkText("Log out")).click();
     
     
	 
	 
			 	 }
}
