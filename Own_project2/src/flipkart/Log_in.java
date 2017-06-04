package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cocepts.JavaScript_executerfor_click;

public class Log_in {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Own_project2\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement loginButton = driver
				.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a"));
		loginButton.click();

		WebElement enterEmailTxtBox = driver
				.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input"));
		enterEmailTxtBox.sendKeys("pallavidash92@gmail.com");

		WebElement enterPassword = driver
				.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input"));
		enterPassword.sendKeys("pallavi123");

		WebElement LoginButton = driver
				.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button"));
        LoginButton.click();
		/*WebElement searchTxtBox = driver.findElement(
				By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
		searchTxtBox.sendKeys("women wears");

		WebElement searchSymbolButton = driver.findElement(
				By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button"));
		searchSymbolButton.click();

		WebElement sortByButton = driver.findElement(By.xpath(""));
		sortByButton.click();

		WebElement electBtn = driver
				.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
		electBtn.click();
		
WebElement elec=driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a/span"));	
		WebElement mobile=driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[1]/a/span[1]"));
	
		Actions act=new Actions(driver);
		act.moveToElement(elec).moveToElement(mobile).click().build().perform();*/
	
        WebElement cart=driver.findElement(By.className("_3NFO0d"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click;",cart);
		
		
		
	}

}
