import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Webdriver01 {
    public static void main(String[] args) throws InterruptedException {
        // Webdriver ayarlamalarini sisteme yapmak icin
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        // Simdi bir data turu WebDriver constructor i ChromeDriver olan obje si olusturabiliriz.
        // Temelde olusturdugumuz obje ChromeDriver in ozelliklerini kullanan bir WebDriver objesi
        // WebDriver bir interface oldugu ve interface lerin contructor i olmaz ve obje uretilemez
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        driver.close();
    }
}