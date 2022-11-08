package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethods1 {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        // System.out.println(driver.getPageSource());

        // driver.close();
    }
}
