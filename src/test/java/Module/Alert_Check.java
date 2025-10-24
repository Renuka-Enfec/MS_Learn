package Module;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/");
		System.out.println("Opened page");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Start']")).click();
		/*System.out.println("Naviagated to Intruduction unit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		System.out.println("Navigated to 2'nd unit");
		System.out.println("Unit 1 title : "+driver.getTitle());*/
		for(int i=1;i<9;i++)
		//for(int i=1;i<10;i++)  stale element reference: stale element not found in the current frame
		{
			Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[.='Next']")).click();
		
			System.out.println("Unit "+i+" title"+" "+driver.getTitle());
			
		}
		
		System.out.println("Opened KC UNit");
		System.out.println();
		driver.findElement(By.xpath("//label[@for='quiz-choice-0-0']")).click();
		Thread.sleep(2000);
		System.out.println("Selected 1'ST KC Question option");
		driver.findElement(By.xpath("//label[@for='quiz-choice-1-1']")).click();
		Thread.sleep(2000);
		System.out.println("Selected 2'nd KC Question option");
		driver.findElement(By.xpath("//label[@for='quiz-choice-2-2']")).click();
		Thread.sleep(2000);
		System.out.println("Selected 3'rd KC Question option");
		driver.findElement(By.xpath("//button[@data-bi-name='module-unit-module-assessment-submit']")).click();
		Thread.sleep(2000);
		System.out.println("Selected KC option and clicked on Submit answer");
		System.out.println("Unit 9 title"+" "+driver.getTitle());
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//h1[.='Summary and resources']"));
		System.out.println("Last unit title is: "+driver.getTitle());
		Thread.sleep(3000);
		
		
		driver.quit();




}}
