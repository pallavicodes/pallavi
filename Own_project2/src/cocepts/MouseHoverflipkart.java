package cocepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverflipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:/workspace/Own_project2/Drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.flipkart.com/");
	
	WebElement logIn=driver.findElement( By.xpath("//a[text()='Log In']"));
	logIn.click();
	
	WebElement emailId=driver.findElement(By.className("_2zrpKA"));
	emailId.sendKeys("pallavidash92@gmail.com");
	WebElement passwordId=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
	passwordId.sendKeys("pallavi123");
	WebElement logInBtn=driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	logInBtn.click();
	
	WebElement se=driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a/span"));
	//WebElement se1=driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[1]/a/span[1]"));
    Actions actions=new Actions(driver);
    actions.moveToElement(se).build().perform();
    //actions.moveToElement(se1).build().perform();    

}
}
