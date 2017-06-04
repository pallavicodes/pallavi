package cocepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_to_Frame {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.gecko.driver","D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://toolsqa.com/iframe-practice-page/");
			
			driver.switchTo().frame("iframe1");
			WebElement ele=driver.findElement(By.xpath("//input[@name='firstname']"));
			String str=ele.getText();
		   System.err.println(str);
		   
		   driver.switchTo().defaultContent();
		   driver.switchTo().frame("iframe2");
		   WebElement eles=driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div[1]/h5"));
			String str1=eles.getText();
			System.err.println(str1);
}
	

}
