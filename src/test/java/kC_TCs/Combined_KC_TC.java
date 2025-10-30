package kC_TCs;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Combined_KC_TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver    driver = new EdgeDriver();
        driver.manage().window().maximize();
        String moduleUrl = "https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/";
        driver.get(moduleUrl);
        driver.findElement(By.xpath("//a[contains(.,'Module assessment')]")).click();
        // Locate Knowledge Check section(s)
        
        List<WebElement> questions = driver.findElements(By.xpath("//div[@class='margin-top-sm margin-bottom-xs field-label']"));

        System.out.println("Total questions found: " + questions.size());
        Assert.assertTrue(questions.size() > 0, "No knowledge check questions found on page!");

        List<String> NotAllowed_Words = Arrays.asList("you", "not", "except", "choose the best answer");
        System.out.println("Condition applied");
        
        
        for (WebElement question : questions) {
            String text = question.getText().trim();
           // System.out.println(text);
            System.out.println("Checking question:"+text);

            // Validate NotAllowed_Words
            for (String word : NotAllowed_Words) {
            Assert.assertFalse(text.contains(word)," Question contains NotAllowed_Words:" + word +" "+text);
            }
            
            // Validate sentence format: starts with capital letter and ends with '?'
            /*if (text.isEmpty()) {
                char firstChar = text.charAt(0);
                Assert.assertTrue(Character.isUpperCase(firstChar),
                        "Question does not start with a capital letter → "+text);
                System.out.println("Starting with uppercase");
                Assert.assertTrue(text.endsWith("?"),
                        "Question does not end with '?' → "+text);
                System.out.println("Question ended with ?");
            }
            */
            
        }
        System.out.println("Proceed to Next");
       driver.quit();
    }

	}

