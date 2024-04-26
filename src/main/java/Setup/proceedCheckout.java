package Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class proceedCheckout {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://egyptlaptop.com/");
        driver.findElement(By.id("search_input")).sendKeys("cable hdmi");
        driver.findElement(By.id("search_input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.className("ut2-gl__name")).click();
        driver.findElement(By.cssSelector("i[class=\"ut2-icon-use_icon_cart\"]")).click();
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("a[id=\"cart_icon_4700\"]")).click();
        driver.findElement(By.cssSelector("span[class=\"ty-icon ty-icon-ok\"]")).click();

        driver.findElement(By.id("litecheckout_fullname")).sendKeys("Omar");
        driver.findElement(By.id("litecheckout_phone")).sendKeys("01010198949");
        driver.findElement(By.id("litecheckout_s_address")).sendKeys("adad 3232 adada");
        // terms and conditions
        driver.findElement(By.cssSelector("label[class=\"cm-check-agreement\"")).click();
        driver.findElement(By.id("litecheckout_place_order")).click();

        driver.quit();
    }
}
