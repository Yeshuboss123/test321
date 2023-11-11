package FrameWork.new1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logs {
	
	@Test
	public void yeshuu() {
	

	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","D:\\Yeshwanth\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
	driver.manage().window().maximize();
	driver.get("https://eu1.captivnet.com/accor/?module=login");
	driver.findElement(By.name("username")).sendKeys("rudraradhya.v@accor.com");
	driver.findElement(By.name("password")).sendKeys("Welcome%2023");
	driver.findElement(By.name("save")).click();

}
	
}
