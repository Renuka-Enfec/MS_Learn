package Module;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KC_Unit_TCs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/");
		driver.findElement(By.xpath("//a[.='Module assessment']")).click();
		System.out.println("Opened page");
		Thread.sleep(3000);
		/*WebElement Questions = driver.findElement(By.xpath("//div[@role='list']//p"));
		System.out.println(Questions.getSize());
		*/
		for(int i=1;i<4;i++) {
			 WebElement Questions = driver.findElement(By.xpath("//div[@role='list']/div/div/div/p["+i+"]"));
			 Thread.sleep(5000);
			//WebElement Questions = driver.findElement(By.xpath("//div[@role='list']//p"));
			System.out.println(Questions.getSize());
			
			String Q_TC = Questions.getText();
			System.out.println("Question: "+i+" "+Q_TC);
			if (Q_TC.contains("you")) {
				System.out.println("Print Quetion should not contain 'YOU' word according to Requirement");
				
			}
			else {
				System.out.println("Okay to proced");
			}
			Thread.sleep(5000);

		}
				
		
		
		/*
		driver.findElement(By.xpath("//span[.='Start']")).click();
				for(int i=1;i<10;i++)
		//for(int i=1;i<10;i++)  stale element reference: stale element not found in the current frame
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Next']")).click();
			String Title = driver.getTitle();
			//System.out.println(Title);
			System.out.println("Unit "+i+" title"+" "+Title);
			
			if (Title.equals("Module assessment - Training | Microsoft Learn")) {
				System.out.println("Checking KC_Unit: ");
				Thread.sleep(5000);
				
			}
			
		}*/
		
		
			//driver.quit();   Session ID is null. Using WebDriver after calling quit()?

	
		driver.quit();}
}
