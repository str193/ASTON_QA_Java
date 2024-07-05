package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MTSByTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void cookieOn() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:/Users/strvt/IdeaProjects/Lesson_8/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='cookie-agree']")).click();
    }


    @Test(description="Проверить название указанного блока")
    public void testMethod1() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pay__wrapper h2")));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        Assert.assertEquals(blockTitle.getText(), expectedTitle);

    }

    @Test(description="Проверить наличие логотипов платёжных систем")
    public void testMethod2() {
        WebElement paymentSection = driver.findElement(By.className("pay__partners"));
        List<WebElement> logos = paymentSection.findElements(By.tagName("img"));

        // Ожидаемые логотипы платёжных систем
        String[] expectedLogos = {
                "visa.svg",
                "visa-verified.svg",
                "mastercard.svg",
                "mastercard-secure.svg",
                "belkart.svg"
        };

        for (String expectedLogo : expectedLogos) {
            boolean logoFound = false;
            for (WebElement logo : logos) {
                if (logo.getAttribute("src").contains(expectedLogo)) {
                    logoFound = true;
                    break;
                }
            }
            assertTrue(logoFound, String.format("Логотип %s не найден", expectedLogo));
        }
    }

    @Test(description="Проверить работу ссылки «Подробнее о сервисе»")
    public void testMethod3() {

        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", currentUrl);

    }

    @Test(description="Заполнить поля и проверить работу кнопки «Продолжить»")
    public void testMethod4() {

        WebElement phone = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        phone.sendKeys("297777777");
        WebElement sumPay = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        sumPay.sendKeys("10");
        WebElement email = driver.findElement(By.xpath("//*[@id='connection-email']"));
        email.sendKeys("StrAston@gmail.com");
        WebElement button = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        button.click();

    }

    @AfterMethod
    public void closeUp1() {
        driver.close();
    }


    @AfterClass
    public void closeUp2() {
        driver.quit();
    }
}









