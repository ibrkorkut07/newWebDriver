package WebElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_WebElementMethods {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//     a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
//     b. Sign in butonuna basin
        WebElement signinButton = driver.findElement(By.id("sign-in"));
        signinButton.sendKeys(Keys.ENTER);
//     c. email textbox,password textbox, and signin button elementlerini locate edin
        WebElement emailBox = driver.findElement(By.className("form-control"));
        WebElement passwordBox = driver.findElement(By.name("session[password]"));
        WebElement signinSubmit = driver.findElement(By.name("commit"));
//     d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign i n)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!
        emailBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");
        signinSubmit.click();
//     e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement signoutButton = driver.findElement(By.linkText("Sign out"));
        if (signoutButton.isDisplayed()) {
            System.out.println("user id is testtechproed@gmail.com");
        } else {
            System.out.println("user id might be different");
        }
//     f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
            WebElement AddressesElement = driver.findElement(By.linkText("Addresses"));

            if (AddressesElement.isDisplayed()) {
                System.out.println("Addresses button is displayed");
            } else {
                System.out.println("Addresses button is NOT displayed");
            }
            if (signoutButton.isDisplayed()) {
                System.out.println("Signout button is displayed");
            } else {
                System.out.println("Signout button is NOT displayed");
            }
//     g. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("sayfada " + linkList.size() + " tane link var");
            driver.quit();
        }
    }