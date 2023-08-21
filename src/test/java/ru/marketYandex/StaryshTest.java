package ru.marketYandex;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StaryshTest {

    @Test
    public void staryshTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://market.yandex.ru/");
        driver.manage().window().maximize();

        WebElement catalog = driver.findElement(By.xpath("//div[@data-zone-name='catalog']"));
        catalog.click();

        WebElement smart = (new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Смартфоны']"))));
        smart.click();

        WebElement priceMax = (new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[label[text()='Цена, ₽ до']]//input[@type='text']"))));
        priceMax.sendKeys("20000");

        WebElement fieldMin = driver.findElement(By.xpath("//span[label[text()='Диагональ экрана (точно), \" от']]//input[@type='text']"));
        fieldMin.sendKeys("3");

        WebElement checkbox1 = driver.findElement(By.xpath("(//div[contains(@data-zone-data, 'Производитель')]//label)[1]"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.xpath("(//div[contains(@data-zone-data, 'Производитель')]//label)[2]"));
        checkbox2.click();

        WebElement checkbox3 = driver.findElement(By.xpath("(//div[contains(@data-zone-data, 'Производитель')]//label)[3]"));
        checkbox3.click();

        WebElement checkbox4 = driver.findElement(By.xpath("(//div[contains(@data-zone-data, 'Производитель')]//label)[4]"));
        checkbox4.click();

        WebElement checkbox5 = driver.findElement(By.xpath("(//div[contains(@data-zone-data, 'Производитель')]//label)[5]"));
        checkbox5.click();

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");







    }

}
