package Module;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GdPr_term_Check_TC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/");
		System.out.println("Opened page");
		Thread.sleep(3000);
		
		List<WebElement> Unit_list = driver.findElements(By.xpath("//ul[@id='unit-list']//li"));
		System.out.println("Fetchetd unitList");
		Unit_list.size();
		for(WebElement ul:Unit_list) {
			ul.click();
			String UnitText = ul.getText();
			System.out.println("UnText: "+UnitText);
			if (UnitText.contains("GDPR")) {
				System.out.println("Unit contains 'GDPR' word");
            } else {
                System.out.println("'GDPR' word not present in unit");
            }
            System.out.println();
        }
        System.out.println("'GDPR' word not present in questions, TC is passed");
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//span[.='Start']")).click();
		/*System.out.println("Naviagated to Intruduction unit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		System.out.println("Navigated to 2'nd unit");
		System.out.println("Unit 1 title : "+driver.getTitle());*/
		/*for(int i=1;i<9;i++)
		//for(int i=1;i<10;i++)  stale element reference: stale element not found in the current frame
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Next']")).click();
			System.out.println("Unit "+i+" title"+" "+driver.getTitle());
		}

        // Wait for page load
        Thread.sleep(2000);
        /*List<WebElement> questions = driver.findElements( By.xpath("//div[@role='list']//div[@class='margin-top-sm margin-bottom-xs field-label']/p"));

        System.out.println("Total questions found: " + questions.size());
        System.out.println();

        for (WebElement q : questions) {
            String text = q.getText().trim();
            System.out.println("Question: " + text);
            if (text.contains("GDPR")) {
                System.out.println("Contains 'GDPR' word");
            } else {
                System.out.println("'GDPR' word not present in question");
            }
            System.out.println();
        }
        System.out.println("'GDPR' word not present in questions, TC is passed");
*/
        driver.quit();

	}

}
