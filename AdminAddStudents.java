package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdminAddStudents {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/dannymeyer/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Add students as a admin
		driver.get("http://omk.herokuapp.com/register");
		driver.findElement(By.id("name")).sendKeys("Danny");
		driver.findElement(By.id("email")).sendKeys("extra@admin.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("password-confirm")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@value='admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[6]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div/div/h2/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/h2/a[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Dan");
		driver.findElement(By.name("id")).sendKeys("30");
		driver.findElement(By.id("class")).sendKeys("3");
		driver.findElement(By.id("zip")).sendKeys("68135");
		driver.findElement(By.name("address")).sendKeys("123 Street");
		driver.findElement(By.name("email")).sendKeys("meyer@gmail.com");
		driver.findElement(By.id("cell_phone")).sendKeys("424324242");
		driver.findElement(By.xpath("/html/body/div/form/div[8]/input")).click();
		Thread.sleep(1000);
	}
}
