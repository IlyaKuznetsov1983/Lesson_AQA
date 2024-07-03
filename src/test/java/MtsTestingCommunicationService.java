import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTestingCommunicationService {
        private static final String Url_Page = "https://mts.by";
        private static final By Button_Accept = By.cssSelector("#cookie-agree");
        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeEach
        public void SetUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
            wait = new WebDriverWait(driver, Duration.ofSeconds(19));
            driver.get(Url_Page);
            driver.findElement(Button_Accept).click();

        }
        @Test
        @DisplayName("Проверка суммы в окне оплаты")
        public void checkSumInPaymentWindow() {
            WebElement phoneInputField = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
            WebElement sumInputField = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
            WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection .button__default"));

            phoneInputField.sendKeys("297777777");
            sumInputField.sendKeys("10");
            continueButton.click();

            WebElement iframe = driver.findElement(By.cssSelector("div.bepaid-app iframe"));
            driver.switchTo().frame(iframe);

            WebElement sumField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                    ("//div[@class = 'pay-description__cost']")));
            String textSumField = sumField.getText();
            String expectedSum = "10.00";
            WebElement payButton = driver.findElement(By.xpath("//button[@class = 'colored disabled']"));
            String textPayButton = payButton.getText();
            String expectedSumInButton = "10.00";

            assertTrue(textSumField.contains(expectedSum),
                    "Текст в форме не соответствует сумме : " + expectedSum);
            assertTrue(textPayButton.contains(expectedSumInButton),
                    "Текст в форме не соответствует сумме : " + expectedSumInButton);
        }

        @Test
        @DisplayName("Проверка незаполненных полей в окне оплаты")
        public void checkBlankFieldsInPaymentWindow() {
            WebElement phoneInputField = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
            WebElement sumInputField = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
            WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection .button__default"));

            phoneInputField.sendKeys("297777777");
            sumInputField.sendKeys("10");
            continueButton.click();

            WebElement iframe = driver.findElement(By.cssSelector("div.bepaid-app iframe"));
            driver.switchTo().frame(iframe);

            WebElement inputCardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//label[text() = 'Номер карты']")));
            WebElement inputExpirationDate = driver.findElement(By.xpath("//label[text() = 'Срок действия']"));
            WebElement inputCVC = driver.findElement(By.xpath("//label[text() = 'CVC']"));
            WebElement inputHolderName = driver.findElement(By.xpath("//label[contains(text(), 'Имя держателя')]"));

            assertEquals("Номер карты", inputCardNumber.getText(), "Текст 'Номер карты' не совпадает");
            assertEquals("Срок действия", inputExpirationDate.getText(), "Текст 'Срок действия' не совпадает");
            assertEquals("Имя держателя (как на карте)", inputHolderName.getText(), "Текст 'Имя держателя' не совпадает");
            assertEquals("CVC", inputCVC.getText(), "Текст 'CVC' не совпадает");
        }

        @Test
        @DisplayName("Проверка иконок платёжных систем в окне оплаты")
        public void checkIconsInPaymentWindow() {
            WebElement phoneInputField = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
            WebElement sumInputField = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
            WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection .button__default"));

            phoneInputField.sendKeys("297777777");
            sumInputField.sendKeys("10");
            continueButton.click();

            WebElement iframe = driver.findElement(By.cssSelector("div.bepaid-app iframe"));
            driver.switchTo().frame(iframe);

            WebElement container = wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//div[contains(@class, 'cards-brands__container')]")));
            List<WebElement> images = container.findElements(By.tagName("img"));
            assertEquals(5, images.size(), "Количество изображений должно быть равно 5");
        }
        @AfterEach
        public void quit() {
            driver.quit();
        }
    }
