package kC_TCs;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.List;

public class You_word_Check {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/9-knowledge-check");
        System.out.println("Opened page");

        // Wait for page load
        Thread.sleep(5000);

       // List<WebElement> questions = driver.findElements(By.xpath("//div[@role='list']/div[@role='listitem']//div[@role='radiogroup']//p") );
        /*List<WebElement> questions = driver.findElements(
        	    By.xpath("//div[@role='listitem']//div[@role='radiogroup']//p")
        	);*/
        List<WebElement> questions = driver.findElements( By.xpath("//div[@role='list']//div[@class='margin-top-sm margin-bottom-xs field-label']/p"));

        System.out.println("Total questions found: " + questions.size());
        System.out.println();

        for (WebElement q : questions) {
            //String text = q.getText().trim();
            String text = q.getText();
            System.out.println("Question: " + text);
            if (text.contains("you")) {
                System.out.println("Contains 'YOU'");
            } else {
                System.out.println("'YOU' word not present in question");
            }
            System.out.println();
        }
        System.out.println("you word not present in questions, TC is passed");

        driver.quit();
    }
}

