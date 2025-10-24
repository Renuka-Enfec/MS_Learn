package Module;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v138.audits.model.SRIMessageSignatureError;
import org.openqa.selenium.edge.EdgeDriver;

public class KC_Unit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/9-knowledge-check");
		System.out.println("Opened KC UNit");
		driver.findElement(By.xpath("//label[@for='quiz-choice-0-0']")).click();
		Thread.sleep(2000);
		System.out.println("1'ST");
		driver.findElement(By.xpath("//label[@for='quiz-choice-1-1']")).click();
		Thread.sleep(2000);
		System.out.println("2'nd");
		driver.findElement(By.xpath("//label[@for='quiz-choice-2-2']")).click();
		Thread.sleep(2000);
		System.out.println("3'rd");
		driver.findElement(By.xpath("//button[@data-bi-name='module-unit-module-assessment-submit']")).click();
		Thread.sleep(2000);
		System.out.println("Selected KC option and clicked on submit answer");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		System.out.println(driver.getTitle());
		driver.quit();

		/*for(int i=9;i<10;i++)
		{
			driver.findElement(By.xpath("//span[.='Next']")).click();
			System.out.println("Unit "+i+" title"+" "+driver.getTitle());
			//System.out.println("Navigated to summary unit ");
		}*/
	}

}
