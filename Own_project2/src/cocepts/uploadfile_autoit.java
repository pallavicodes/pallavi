package cocepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile_autoit {
	public static void main(String[] args) throws IOException {
		
	
	System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http:\\only-testing-blog.blogspot.in\\2014\\01\\textbox.html");
	driver.findElement(By.name("img")).click();
	Runtime.getRuntime().exec("D:\\workspace\\Own_project2\\Drivers\\uploadautoit.exe");
	
	
	
}
}