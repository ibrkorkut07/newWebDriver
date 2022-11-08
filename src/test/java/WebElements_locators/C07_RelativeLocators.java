package WebElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C07_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //  https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
    //  Berlin’i 3 farkli relative locator ile locate edin
        WebElement boston = driver.findElement(By.id("pid6_thumb"));
        WebElement sailor = driver.findElement(By.id("pid11_thumb"));
        WebElement bayArea = driver.findElement(By.id("pid8_thumb"));
        WebElement nyc = driver.findElement(By.id("pid3_thumb"));
        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston).toLeftOf(bayArea));
        WebElement berlin2 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor).below(nyc));
        WebElement berlin3 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).toLeftOf(bayArea));
    //  Relative locator’larin dogru calistigini test edin
        String expectedIdValue = "pid7_thumb";
        String actualIdValue1 = berlin1.getAttribute("id");
        if (expectedIdValue.equals(actualIdValue1)) {
            System.out.println("RelativeLocator1 works correctly");
        } else {
            System.out.println("RelativeLocator1 does NOT work correctly");
        }

        String actualIdValue2 = berlin2.getAttribute("id");
        if (expectedIdValue.equals(actualIdValue2)) {
            System.out.println("RelativeLocator2 works correctly");
        } else {
            System.out.println("RelativeLocator2 does NOT work correctly");
        }

        String actualIdValue3 = berlin3.getAttribute("id");
        if (expectedIdValue.equals(actualIdValue3)) {
            System.out.println("RelativeLocator3 works correctly");
        } else {
            System.out.println("RelativeLocator3 does NOT work correctly");
        }
        driver.quit();
    }
}

/*
        public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // driver.quit();
    }
 */