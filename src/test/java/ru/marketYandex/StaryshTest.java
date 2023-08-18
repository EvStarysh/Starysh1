package ru.marketYandex;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaryshTest {

    @Test
    public void staryshTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://market.yandex.ru/");
        driver.manage().window().maximize();

        WebElement katalog = driver.findElement(By.xpath("//div[@data-zone-name='catalog']"));
        katalog.click();

        WebElement smart = (new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Смартфоны']"))));
        smart.click();

        WebElement cenado = (new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Цена, ₽ до']"))));
        cenado.sendKeys("20000", Keys.ENTER);


    }

}
