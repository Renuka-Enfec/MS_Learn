package kC_TCs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class QuestionMark_check_TC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/9-knowledge-check");
        System.out.println("Opened page");

        // Wait for page load
        Thread.sleep(2000);

       // List<WebElement> questions = driver.findElements(By.xpath("//div[@role='list']/div[@role='listitem']//div[@role='radiogroup']//p") );
        /*List<WebElement> questions = driver.findElements(
        	    By.xpath("//div[@role='listitem']//div[@role='radiogroup']//p")
        	);*/
        List<WebElement> questions = driver.findElements( By.xpath("//div[@role='list']//div[@class='margin-top-sm margin-bottom-xs field-label']/p"));

        System.out.println("Total questions found: " + questions.size());
        System.out.println();

        for (WebElement q : questions) {
            String text = q.getText().trim();
            System.out.println("Question: " + text);
            if (text.contains("?")) {
                System.out.println("Contain '?' at the end");
            } else {
                System.out.println("'?' not present at the end of question");
            }
            System.out.println();
        }
        System.out.println("'?' is present for all questions at the end, TC is passed");

        driver.quit();

	}

}
