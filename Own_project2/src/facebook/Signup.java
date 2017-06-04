package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	
public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver","D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();

driver.get("https://www.facebook.com/");

WebElement firstNameTxtBox=driver.findElement(By.xpath(".//*[@id='u_0_1']"));
firstNameTxtBox.sendKeys("kiran");

WebElement lastNameTxtBox=driver.findElement(By.xpath(".//*[@id='u_0_3']"));
lastNameTxtBox.sendKeys("dash");

WebElement mobileNoTxtBox=driver.findElement(By.xpath(".//*[@id='u_0_6']"));
mobileNoTxtBox.sendKeys("8594919532");

WebElement newPasswordTxtBox=driver.findElement(By.xpath(".//*[@id='u_0_d']"));
newPasswordTxtBox.sendKeys("kirankanti233");

Select brthdt=new Select(driver.findElement(By.xpath("//select[@id='day']")));
brthdt.selectByValue("24");

Select birthMonthTxtBox=new Select(driver.findElement(By.xpath("//select[@id='month']")));
birthMonthTxtBox.selectByValue("8");

Select brthyear=new Select(driver.findElement(By.xpath("//select[@id='year']")));
brthyear.selectByValue("1992");


WebElement genderSelcButton=driver.findElement(By.xpath(".//*[@id='u_0_j']/span[1]/label"));
genderSelcButton.click();

WebElement creatAccButton=driver.findElement(By.xpath(".//*[@id='u_0_l']"));
creatAccButton.click();

WebElement needOfDOBbutton=driver.findElement(By.xpath(".//*[@id='birthday-help']"));
needOfDOBbutton.click();

WebElement verifyMobNoTxtBox=driver.findElement(By.xpath(".//*[@id='code_in_cliff']"));
verifyMobNoTxtBox.sendKeys("38138");

WebElement continueToLogin=driver.findElement(By.xpath(".//*[@id='u_6_1']"));
continueToLogin.click();

}
}