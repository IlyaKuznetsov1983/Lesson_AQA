import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MtsTesting {

    private static final By Pay_Button = By.cssSelector("#pay-connection > button");
    private static final By Img_Visa_Found = By.xpath("//div[@class='pay__partners']/ul/li/img[@alt='Visa']");
    private static final By Img_Verified_By_Visa_Found = By.xpath("//div[@class='pay__partners']/ul/li/img[@alt='Verified By Visa']");
    private static final By Block_Text = By.xpath("//section[@class = 'pay']//h2");
    private static final By Accept_Button = By.cssSelector("#cookie-agree");
    private static final By Telephone_Button = By.cssSelector("#connection-phone");
    private static final By Summa_Button = By.cssSelector("#connection-sum");
    private static final By Img_BelCard_Found = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(5) > img");
    private static final By About_Service_Button = By.xpath("//div[@class='pay__wrapper']/a");
    private static final By Email_Button = By.cssSelector("#connection-email");
    private static final By Img_Master_Card_Found = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(3) > img");
    private static final By Img_Master_Card_Secure_Code_Found = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(4) > img");

    private WebDriver driver;

    @Test
    void cardReplenishment() {

        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        WebElement text = driver.findElement(Block_Text);
        assertEquals("Онлайн пополнение" + "\n" + "без комиссии", text.getText());
        driver.quit();

    }
    @Test
    void logoVisa() {
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        boolean isDisplayed = driver.findElement(Img_Visa_Found).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void verifiedVisa() {
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        boolean isDisplayed = driver.findElement(Img_Verified_By_Visa_Found).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void LogoMasterCard() {
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        boolean isDisplayed = driver.findElement(Img_Master_Card_Found).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void masterCardSecureCode() {
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        boolean isDisplayed = driver.findElement(Img_Master_Card_Secure_Code_Found).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void logoBelcard() {
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        boolean isDisplayed = driver.findElement(Img_BelCard_Found).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }

    @Test
    void checkAboutButton() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        driver.findElement(About_Service_Button).click();
        String urlActual = driver.getCurrentUrl();
        System.out.println(urlActual);
        String urlExpected = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertEquals(urlExpected, urlActual);
        driver.quit();
    }
    @Test
    void continueButton() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.findElement(Accept_Button).click();
        driver.findElement(Telephone_Button).clear();
        driver.findElement(Telephone_Button).sendKeys("297777777");
        driver.findElement(Summa_Button).clear();
        driver.findElement(Summa_Button).sendKeys("100");
        driver.findElement(Email_Button).clear();
        driver.findElement(Email_Button).sendKeys("email@yandex.ru");
        boolean isEnabled = driver.findElement(Pay_Button).isEnabled();
        Assert.assertTrue(isEnabled);
        driver.quit();
    }

}
