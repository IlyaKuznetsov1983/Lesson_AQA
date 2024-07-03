import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;


public class MtsTestingPaymentService {
        private static final String Url_Page = "https://mts.by";
        private static final By Button_Accept = By.cssSelector("#cookie-agree");
        private static final By Payment_Button = By.xpath("//button[@class = 'select__header']");
        private static final By Communication_Service_Payment_Selection = By.xpath("//p[@class='select__option'][text()='Услуги связи']");
        private static final By Phone_Connection = By.xpath("//input[@id = 'connection-phone']");
        private static final By Sum_Connection = By.xpath("//input[@id = 'connection-sum']");
        private static final By Email_Connection = By.xpath("//input[@id = 'connection-email']");
        private static final By Home_Internet_Selection = By.xpath("//p[@class='select__option'][text()='Домашний интернет']");
        private static final By Phone_Internet = By.xpath("//input[@id = 'internet-phone']");
        private static final By Sum_Internet = By.xpath("//input[@id = 'internet-sum']");
        private static final By Email_Internet = By.xpath("//input[@id = 'internet-email']");
        private static final By Installments_Payment_Selection = By.xpath("//p[@class='select__option'][text()='Рассрочка']");
        private static final By Score_Installment_Field = By.xpath("//input[@id = 'score-instalment']");
        private static final By Sum_Installment_Field = By.xpath("//input[@id = 'instalment-sum']");
        private static final By Email_Installment_Field = By.xpath("//input[@id = 'instalment-email']");
        private static final By Debt_Payment_Button = By.xpath("//p[@class='select__option'][text()='Задолженность']");
        private static final By Score_Debt_Field = By.xpath("//input[@id = 'score-arrears']");
        private static final By Sum_Debt_Field = By.xpath("//input[@id = 'arrears-sum']");
        private static final By Email_Debt_Field = By.xpath("//input[@id = 'arrears-email']");

        private WebDriver driver;

        @BeforeEach
        public void SetUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
            driver.get(Url_Page);
            driver.findElement(Button_Accept).click();

        }

        @Test
        @DisplayName("Проверка надписи в незаполненных полях: Услуги связи")
        void testCommunicationService() {

            driver.findElement(Payment_Button).click();
            driver.findElement(Communication_Service_Payment_Selection).click();
            WebElement phoneInputField = driver.findElement(Phone_Connection);
            assertEquals("Номер телефона", phoneInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"Номер телефона\"");
            WebElement sumInputField = driver.findElement(Sum_Connection);
            assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"Сумма\"");
            WebElement emailInputField = driver.findElement(Email_Connection);
            assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"E-mail для отправки чека\".");

        }

        @Test
        @DisplayName("Проверка надписи в незаполненных полях : Домашний интернет")
        void testHomeInternet() {

            driver.findElement(Payment_Button).click();
            driver.findElement(Home_Internet_Selection).click();
            WebElement phoneInputField = driver.findElement(Phone_Internet);
            assertEquals("Номер абонента", phoneInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"Номер абонента\"");
            WebElement sumInputField = driver.findElement(Sum_Internet);
            assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"Сумма\"");
            WebElement emailInputField = driver.findElement(Email_Internet);
            assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"E-mail для отправки чека\"");

        }

        @Test
        @DisplayName("Проверка надписи в незаполненных полях : Рассрочка")
        void testInstallments() {

            driver.findElement(Payment_Button).click();
            driver.findElement(Installments_Payment_Selection).click();
            WebElement accountNumberInputField = driver.findElement(Score_Installment_Field);
            assertEquals("Номер счета на 44", accountNumberInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"Номер счета на 44\"");
            WebElement sumInputField = driver.findElement(Sum_Installment_Field);
            assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                    "Текст не совпадает с ожидаемым \"Сумма\"");
            WebElement emailInputField = driver.findElement(Email_Installment_Field);
            assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                    "Текст  не совпадает с \"E-mail для отправки чека\"");

        }

        @Test
        @DisplayName("Проверка надписи в незаполненных полях : Задолженность")
        void testDebt() {

            driver.findElement(Payment_Button).click();
            driver.findElement(Debt_Payment_Button).click();
            WebElement accountNumberInputField = driver.findElement(Score_Debt_Field);
            assertEquals("Номер счета на 2073", accountNumberInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"Номер счета на 2073\"");
            WebElement sumInputField = driver.findElement(Sum_Debt_Field);
            assertEquals("Сумма", sumInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"Сумма\"");
            WebElement emailInputField = driver.findElement(Email_Debt_Field);
            assertEquals("E-mail для отправки чека", emailInputField.getAttribute("placeholder"),
                    "Текст не совпадает с \"E-mail для отправки чека\"");

        }

        @AfterEach
        public void quit() {
            driver.quit();
        }

    }

