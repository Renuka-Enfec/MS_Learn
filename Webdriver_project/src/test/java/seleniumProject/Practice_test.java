package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//TC1: Positive login test
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("Logged TEST PRACTICE SUCCESSFULLY");
		
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("Logged out TEST Practice");
		
		//TC2: Pass Negative usename: according to data it should fail: PASSED
		driver.findElement(By.id("username")).sendKeys("student_2");   //your username is invalid!
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("Logging is failed then this TC2 is passed");
		Thread.sleep(5000);
		
		//TC3: Pass invalid password try it will pass/fail, it should fail: PASSED
		
		driver.findElement(By.id("username")).sendKeys("student");   
		driver.findElement(By.id("password")).sendKeys("Password12345");	//Your password is invalid!
		driver.findElement(By.id("submit")).click();
		System.out.println("Logging is failed then this TC3 is passed");
				
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("Logged TEST PRACTICE SUCCESSFULLY");
		
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("Logged out TEST Practice");
		
		System.out.println("Successufully execute 1 positive and 2 negative TC'S");
		driver.quit();

	}

}
