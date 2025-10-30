package kC_TCs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_TrueFalse_OptionCheck_TC {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/9-knowledge-check");
    System.out.println("Opened page");

    // Wait for page load
    Thread.sleep(2000);
    List<WebElement> options = driver.findElements( By.xpath("//div[@role='list']//div[@class='field-body']//label"));

    System.out.println("Total options found: " + options.size());
    System.out.println();

    for (WebElement q : options) {
        String text = q.getText().trim();
        System.out.println("options are: " + text);
        if (text.contains("true")) {
            System.out.println("Contains 'true' option");
            
        } 
        if (text.contains("false")) {
        	System.out.println("Contains 'false' option");
			
		}
        else {
            System.out.println("'true or falsee' option not present for question option");
        }
   
    }

    driver.quit();

}

	}


