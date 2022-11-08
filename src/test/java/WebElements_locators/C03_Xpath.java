package WebElements_locators;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        1  https://the internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//        2  Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//        3  Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete button is displayed");
        } else {
            System.out.println("Delete button is NOT displayed");
        }
//        4  Delete tusuna basin
        deleteButton.click();
//        5  Add/Remove Elements ” yazisinin gorunur oldugunu test edin
        WebElement AddRemoveElementsText = driver.findElement(By.xpath("//h3"));
//      WebElement AddRemoveElementsText2 = driver.findElement(By.tagName("h3"));
        if (AddRemoveElementsText.isDisplayed()) {
            System.out.println("AddRemoveElementsText is displayed");
        } else {
            System.out.println("AddRemoveElementsText is NOT displayed");
        }
    }
}
