package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminViewStudents {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/dannymeyer/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//View students as a admin
		driver.get("http://omk.herokuapp.com/register");
		driver.findElement(By.id("name")).sendKeys("Danny");
		driver.findElement(By.id("email")).sendKeys("extra2@admin.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("password-confirm")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@value='admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div/div/div[2]/form/div[6]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div/div/h2/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/h2/a[4]")).click();
		Thread.sleep(1000);
	}

}
