import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods2 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chore.driver", "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Title contains Amazon");
        } else {
            System.out.println("Title does not contain amazon");
        }
        // 6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")) {
            System.out.println("Url contains Amazon");
        } else {
            System.out.println("Url does not contain amazon");
        }
        // 8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        if (driver.getPageSource().contains("shop")) {
            System.out.println("HTML contains shop");
        } else {
            System.out.println("HTML does not contain shop");
        }
        // 10. Sayfayi kapatin.
        // driver.close();

    }
}
