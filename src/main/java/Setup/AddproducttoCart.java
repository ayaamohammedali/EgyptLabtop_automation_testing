package Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddproducttoCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://egyptlaptop.com/");
        driver.findElement(By.id("search_input")).sendKeys("cable hdmi");
        driver.findElement(By.id("search_input")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("ut2-gl__name")).click();
        driver.findElement(By.cssSelector("i[class=\"ut2-icon-use_icon_cart\"]")).click();


        driver.quit();
    }
}
