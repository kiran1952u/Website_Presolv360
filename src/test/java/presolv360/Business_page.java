package presolv360;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Business_page {
    @Test
    public void Login1() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver(options);
        driver1.get("https://presolv360.com/");
        driver1.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));

        // Click on the Inquiry button
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("/html/body/div[1]/div/div[2]/div[1]/section/div[1]/div/button"))).click();

        // Fill in Full Name
        WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
        nameField.sendKeys("kiran");

        // Fill in Organization Name
        WebElement orgField = driver1.findElement(By.id("orgname"));
        orgField.sendKeys("presolv");

        // Fill in Mobile Number
        WebElement numberField = driver1.findElement(By.id("number"));
        numberField.sendKeys("9137884572");

        // Fill in Email
        WebElement emailField = driver1.findElement(By.id("email"));
        emailField.sendKeys("kiran@presolv360.com");

        // Click Submit Button
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(), 'Submit') and contains(@class, 'blue_btn')]")));
        submitButton.click();

        // Optional: Wait for confirmation or next screen
        Thread.sleep(3000);  // Replace with better wait if needed

        // Close browser
//        driver1.quit();
    }
}
