package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    //  2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
    //  3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
    //  4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(80, 100));
        driver.manage().window().setSize(new Dimension(700, 800));
    //  5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        if (driver.manage().window().getPosition().x==80 && driver.manage().window().getPosition().y==100) {
            System.out.println("It is the right position");
        } else {
            System.out.println("It is not the right position");
        }
        if (driver.manage().window().getSize().height==700 && driver.manage().window().getSize().width==800) {
            System.out.println("It is the right size");
        } else {
            System.out.println("It is not the right size");
        }
    //  8. Sayfayi kapatin
        driver.quit();
    }
}
