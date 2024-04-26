package Setup;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchForProduct {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://egyptlaptop.com/");
        driver.findElement(By.id("search_input")).sendKeys("hdmi cable");
        driver.findElement(By.id("search_input")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);

        driver.quit();
    }
}
