package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_Revision {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//  2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
//     (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");
        if (driver.getTitle()=="Youtube") {
            System.out.println("Title is Youtube");
        } else {
            System.out.println("Actual title: " + driver.getTitle());
        }
//  3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        if (driver.getCurrentUrl().contains("youtube")) {
            System.out.println("Current Url contains youtube");
        } else {
            System.out.println("Actual Url: " + driver.getCurrentUrl());
        }
//  4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//  5. Youtube sayfasina geri donun
        driver.navigate().back();
//  6. Sayfayi yenileyin
        driver.navigate().refresh();
//  7. Amazon sayfasina donun
        driver.navigate().forward();
//  8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
//  9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
//     Yoksa doğru başlığı(Actual Title) yazdırın.
        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Title contains Amazon");
        } else {
            System.out.println("Actual title: " + driver.getTitle());
        }
//  10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String expectedUrl = "https://www.amazon.com/";
        String currentUrl = driver.getCurrentUrl();
        if (expectedUrl==currentUrl) {
            System.out.println("PageUrl is the expectedUrl");
        } else {
            System.out.println("The real PageUrl is " + currentUrl);
        }
//  11. Sayfayi kapatin
        driver.quit();
    }
}
