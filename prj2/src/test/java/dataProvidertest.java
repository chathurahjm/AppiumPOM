import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class dataProvidertest {

    private AndroidDriver driver;
    private  WebDriverWait wait;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "AOSP on IA Emulator");
        desiredCapabilities.setCapability("appium:platformVersion", "9");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:appPackage", "io.appium.android.apis");
        desiredCapabilities.setCapability("appium:automationName", "Appium");
        desiredCapabilities.setCapability("appium:app", "/Users/chathurajayasinghe/Downloads/ApiDemos-debug.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void sampleTestForAccicibility() {

        SoftAssert softAssert = new SoftAssert();
        MobileElement lblAccessibility = (MobileElement) driver.findElementByAccessibilityId("Accessibility");
        String actualText = lblAccessibility.getText();
        softAssert.assertEquals(actualText,"Accessibility");
        softAssert.assertAll();

    }
    @Test
    public void sampleTestForAnimation() {

        SoftAssert softAssert = new SoftAssert();
        MobileElement lblAccessibility = (MobileElement) driver.findElementByAccessibilityId("Animation");
        String actualText = lblAccessibility.getText();
        softAssert.assertEquals(actualText,"Animation");
        softAssert.assertAll();

    }

    @Test
    public void sampleTestForApp() {
        SoftAssert softAssert = new SoftAssert();
        MobileElement lblAccessibility = (MobileElement) driver.findElementByAccessibilityId("App");
        String actualText = lblAccessibility.getText();
        softAssert.assertEquals(actualText,"App");
        softAssert.assertAll();
    }


    @Test
    public void sampleTestForAllTheListItems() {
        SoftAssert softAssert = new SoftAssert();

        List<String> dataList = Arrays.asList("Accessibility","Animation","App","Content","Graphics","Media","NFC","OS","Preference","Text","Views");

        dataList.iterator().forEachRemaining(data->{
            System.out.println(data);
            MobileElement lblAccessibility = (MobileElement) driver.findElementByAccessibilityId(data);
            String actualText = lblAccessibility.getText();
            softAssert.assertEquals(actualText,data);
            softAssert.assertAll();
    });
    }

    @DataProvider
    public Object[][] sampleDataProviderForAppiumTest() {
        return new Object[][]{
                {"Accessibility"}, {"Animation"}, {"App"}, {"Content"}, {"Graphics"}, {"Media"}, {"NFC"}, {"OS"}, {"Preference"}
        };
    }

    @Test(dataProvider = "sampleDataProviderForAppiumTest")
    public void sampleTestForAppUsingDataProvider(String dataItem) {

        System.out.println("Data validation on appium test with :"+dataItem);
        SoftAssert softAssert = new SoftAssert();
        MobileElement lblAccessibility = (MobileElement) driver.findElementByAccessibilityId(dataItem);
        String actualText = lblAccessibility.getText();
        softAssert.assertEquals(actualText,dataItem);
        softAssert.assertAll();
    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
