package WebElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_XpathRevision {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //  https://www.amazon.com/ adresine gidin
    //  Browseri tam sayfa yapin
    //  Sayfayi “refresh” yapin
    //  Sayfa basliginin “Spend less” ifadesi icerdigini test edin
    //  Gift Cards sekmesine basin
    //  Birthday butonuna basin
    //  Best Seller bolumunden ilk urunu tiklayin
    //  Gift card details’den 25 $’i secin
    //  Urun ucretinin 25$ oldugunu test edin
    //  Sayfayi kapatin


        // driver.quit();
    }
}



