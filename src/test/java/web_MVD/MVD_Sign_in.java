package web_MVD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MVD_Sign_in {
// can not inspect the security check popup since it is by microsoft
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://aka.ms/AVDWeb ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Opened link");
		Thread.sleep(5000);/*
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("v-rkaparatti@microsoft.com");
		System.out.println("entered email");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Clicked on next");
		
		Thread.sleep(10);
		driver.findElement(By.xpath("//div[.='India Desktop']")).click();
		System.out.println("Clicking to India deskotpo");
		Thread.sleep(5000);*/
		
		driver.quit();

	}

}
