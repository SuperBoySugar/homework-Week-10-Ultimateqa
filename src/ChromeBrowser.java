import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the Url into browser
        driver.get(baseUrl);
        // Maximize the browser
        driver.manage().window().maximize();
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Print the current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        // Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("Prime123@gmail.com");
        // Enter the password to password field
        WebElement passwordfield = driver.findElement(By.id("user[password]"));
        passwordfield.sendKeys("Primexyz");
    }
}
