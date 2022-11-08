package WebElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WebElementGetMethods {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//  a. http://www.amazon.com adresine gidiniz.
        driver.get("http://www.amazon.com");
//  b. Search(ara) “city bike”
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike" + Keys.ENTER);
//  c. Amazon 'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement resultText = driver.findElement(By.className("sg-col-inner"));
        System.out.println(resultText.getText());
//  d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkElementLink = driver.findElement(By.className("s-image"));
        ilkElementLink.click();
//      driver.findElement(By.className("s-image")).click();
        // driver.quit();
    }
}
