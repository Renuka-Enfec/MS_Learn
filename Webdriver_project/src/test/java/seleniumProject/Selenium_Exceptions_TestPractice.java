package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Exceptions_TestPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//login application
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println("Logged in TEST PRACTICE SUCCESSFULLY");
		Thread.sleep(5000);
		//Click on PRACTICE tap
		driver.findElement(By.xpath("//a[.='Practice']")).click();
		System.out.println("clicked on PRACTICE");
		driver.findElement(By.linkText("Test Exceptions")).click();
		
		System.out.println("Clicked on TEST EXCEPTION");
		Thread.sleep(3000);
		driver.findElement(By.id("add_btn")).click();
		
		System.out.println("Check row2 is added ");   // Row 2 is added,so TC is passed
		
		Thread.sleep(3000);
		//passing data to input
		// NoSuchElementException : element is not loaded
		//driver.findElement(By.xpath("//div[@id='row2']")).sendKeys("Roti");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement row2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='row2']")));
		row2.sendKeys("Roti");
		driver.findElement(By.id("save_btn")).click();
		
		System.out.println("Passed value to the ROW2");
		
		driver.quit();

	}

}
