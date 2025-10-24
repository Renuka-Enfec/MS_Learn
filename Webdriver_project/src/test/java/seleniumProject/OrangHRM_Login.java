package seleniumProject;

import java.awt.Dialog;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//End-to end TC: login to log out 
public class OrangHRM_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Application opened");
		/*driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		System.out.println("OrangeHRM logged in successfully");
		driver.quit();

	}

}
