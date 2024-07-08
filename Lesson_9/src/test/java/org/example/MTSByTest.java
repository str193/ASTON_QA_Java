package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MTSByTest {
    private WebDriver driver;

    @BeforeMethod
    public void cookieOn() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:/Users/strvt/IdeaProjects/Lesson_9/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='cookie-agree']")).click();
    }

    @Test(description="Проверить надписи в незаполненных полях 'Услуги связи'")
    public void testMethod1() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select__header")));
        dropdownButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select__list")));


        List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".select__item .select__option")));

        for (WebElement item : listItems) {
            if ("Услуги связи".equals(item.getText())) {
                item.click();
                break;
            }
        }

        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        assertEquals("Номер телефона", phoneInput.getAttribute("placeholder"));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        assertEquals("Сумма", sumInput.getAttribute("placeholder"));
        WebElement emailInput = driver.findElement(By.id("connection-email"));
        assertEquals("E-mail для отправки чека", emailInput.getAttribute("placeholder"));

    }


    @Test(description="Проверить надписи в незаполненных полях 'Домашний интернет'")
    public void testMethod2() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select__header")));
        dropdownButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select__list")));


        List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".select__item .select__option")));

        for (WebElement item : listItems) {
            if ("Домашний интернет".equals(item.getText())) {
                item.click();
                break;
            }
        }

        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        assertEquals("Номер телефона", phoneInput.getAttribute("placeholder"));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        assertEquals("Сумма", sumInput.getAttribute("placeholder"));
        WebElement emailInput = driver.findElement(By.id("connection-email"));
        assertEquals("E-mail для отправки чека", emailInput.getAttribute("placeholder"));

    }

    @Test(description="Проверить надписи в незаполненных полях 'Рассрочка'")
    public void testMethod3() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select__header")));
        dropdownButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select__list")));


        List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".select__item .select__option")));

        for (WebElement item : listItems) {
            if ("Рассрочка".equals(item.getText())) {
                item.click();
                break;
            }
        }

        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("score-instalment")));
        assertEquals("Номер счета на 44", phoneInput.getAttribute("placeholder"));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        assertEquals("Сумма", sumInput.getAttribute("placeholder"));
        WebElement emailInput = driver.findElement(By.id("connection-email"));
        assertEquals("E-mail для отправки чека", emailInput.getAttribute("placeholder"));

    }

    @Test(description="Проверить надписи в незаполненных полях 'Задолженность'")
    public void testMethod4() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select__header")));
        dropdownButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select__list")));


        List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".select__item .select__option")));

        for (WebElement item : listItems) {
            if ("Задолженность".equals(item.getText())) {
                item.click();
                break;
            }
        }

        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("score-arrears")));
        assertEquals("Номер счета на 2073", phoneInput.getAttribute("placeholder"));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        assertEquals("Сумма", sumInput.getAttribute("placeholder"));
        WebElement emailInput = driver.findElement(By.id("connection-email"));
        assertEquals("E-mail для отправки чека", emailInput.getAttribute("placeholder"));

    }

    @Test(description="Проверить корректность отображения суммы (в том числе на кнопке), номера телефона," +
            " а также надписей в незаполненных полях для ввода реквизитов карты," +
            " наличие иконок платёжных систем.")
    public void testMethod5() {
        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement phone = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        phone.sendKeys("297777777");
        WebElement sumPay = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        sumPay.sendKeys("10");
        WebElement email = driver.findElement(By.xpath("//*[@id='connection-email']"));
        email.sendKeys("StrAston@gmail.com");
        WebElement button = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        button.click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe.bepaid-iframe")));


        WebElement paymentAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pay-description__cost > span:nth-child(1)")));
        assertEquals("10.00 BYN", paymentAmount.getText());
        WebElement payButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".colored.disabled[type='submit']")));
        assertEquals("Оплатить 10.00 BYN", payButton.getText());
        WebElement paymentDescription = driver.findElement(By.cssSelector(".pay-description__text span"));
        assertEquals("Оплата: Услуги связи Номер:375297777777", paymentDescription.getText());

        WebElement cardInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Номер карты')]")));
        assertEquals("Номер карты", cardInput.getText());
        WebElement validityCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Срок действия')]")));
        assertEquals("Срок действия", validityCard.getText());
        WebElement cvcText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'CVC')]")));
        assertEquals("CVC", cvcText.getText());
        WebElement mastercardIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='assets/images/payment-icons/card-types/mastercard-system.svg']")));
        assertTrue(mastercardIcon.isDisplayed());
        WebElement visaIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='assets/images/payment-icons/card-types/visa-system.svg']")));
        assertTrue(visaIcon.isDisplayed());
        WebElement belkartIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='assets/images/payment-icons/card-types/belkart-system.svg']")));
        assertTrue(belkartIcon.isDisplayed());
        WebElement mirIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='assets/images/payment-icons/card-types/mir-system-ru.svg']")));
        assertTrue(mirIcon.isDisplayed());
        WebElement maestroIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='assets/images/payment-icons/card-types/maestro-system.svg']")));
        assertTrue(maestroIcon.isDisplayed());

        driver.switchTo().defaultContent();


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
