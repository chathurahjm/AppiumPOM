import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class userLoginTest {


    private AndroidDriver driver;

    private WebDriverWait wait;


   // @BeforeSuite
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "AOSP on IA Emulator");
        desiredCapabilities.setCapability("appium:platformVersion", "9");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:appPackage", "com.iitdh.sonusourav.instigo");
        desiredCapabilities.setCapability("appium:appActivity", ".Account.SplashActivity");
        desiredCapabilities.setCapability("appium:automationName", "Appium");//UIAutomator2
        desiredCapabilities.setCapability("appium:noReset", false);
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        //Imlicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void validateUserCanLogInToTheSystemSuccessfully() {

        SoftAssert softAssert = new SoftAssert();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //Explicit wait
        By btnSkip = By.id("com.iitdh.sonusourav.instigo:id/btn_skip");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSkip));
        driver.findElement(btnSkip).click();

//        MobileElement btnSkip = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/btn_skip");
//        btnSkip.click();

        MobileElement txtUserName = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_user_name");
        txtUserName.click();
        txtUserName.sendKeys("cja@mailinator.com");

        MobileElement txtPassword = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_password");
        txtPassword.click();
        txtPassword.sendKeys("Qwerasdf");

        MobileElement chkRememberMe = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/remember_me_chk_box");
        chkRememberMe.click();

        MobileElement btnLogin = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/button_login");
        btnLogin.click();

        MobileElement btnHamburgerMenu = (MobileElement) driver.findElementByAccessibilityId("Drawer Open");
        btnHamburgerMenu.click();

        MobileElement lblUserName = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/nav_header_username");
        lblUserName.click();

        String usrName = lblUserName.getText();

        softAssert.assertEquals(usrName,"cja");

        softAssert.assertAll();

    }

    public void validateComplaintsLandingPage()
    {
        SoftAssert softAssert = new SoftAssert();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //Explicit wait
        By btnSkip = By.id("com.iitdh.sonusourav.instigo:id/btn_skip");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSkip));
        driver.findElement(btnSkip).click();

//        MobileElement btnSkip = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/btn_skip");
//        btnSkip.click();

        MobileElement txtUserName = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_user_name");
        txtUserName.click();
        txtUserName.sendKeys("cja@mailinator.com");

        MobileElement txtPassword = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_password");
        txtPassword.click();
        txtPassword.sendKeys("Qwerasdf");

        MobileElement chkRememberMe = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/remember_me_chk_box");
        chkRememberMe.click();

        MobileElement btnLogin = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/button_login");
        btnLogin.click();

       //MobileElement btnLogin = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/imagebt_bp");

    }


    @Test
    public void test1()
    {
        By btnSkip = By.id("com.iitdh.sonusourav.instigo:id/btn_skip");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSkip));
        driver.findElement(btnSkip).click();

//        MobileElement btnSkip = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/btn_skip");
//        btnSkip.click();

        MobileElement txtUserName = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_user_name");
        txtUserName.click();
        txtUserName.sendKeys("cja@mailinator.com");

        MobileElement txtPassword = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_password");
        txtPassword.click();
        txtPassword.sendKeys("Qwerasdf");

        MobileElement chkRememberMe = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/remember_me_chk_box");
        chkRememberMe.click();

        MobileElement btnLogin = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/button_login");
        btnLogin.click();

        MobileElement lyrHome = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/include_home");

        List<MobileElement> tileList = lyrHome.findElements(By.className("android.widget.FrameLayout"));

        tileList.get(1).click();




    }

    @Test
    public void scrollTest()
    {

        //User Login

        By btnSkip = By.id("com.iitdh.sonusourav.instigo:id/btn_skip");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSkip));
        driver.findElement(btnSkip).click();

//        MobileElement btnSkip = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/btn_skip");
//        btnSkip.click();

        MobileElement txtUserName = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_user_name");
        txtUserName.click();
        txtUserName.sendKeys("cja@mailinator.com");

        MobileElement txtPassword = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_password");
        txtPassword.click();
        txtPassword.sendKeys("Qwerasdf");

        MobileElement chkRememberMe = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/remember_me_chk_box");
        chkRememberMe.click();

        MobileElement btnLogin = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/button_login");
        btnLogin.click();

        //End user login
        MobileElement btnComplain =  (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/imagebt_bp");
        btnComplain.click();

        MobileElement btnStatus =  (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/maintenance_status");
        btnStatus.click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        (new TouchAction(driver)).press(PointOption.point(531,1948)).moveTo(PointOption.point(531, 923)).release().perform();


        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    @Test
    public void validateUserCanSuccessfullyCreateAComplaint()
    {

        SoftAssert softAssert = new SoftAssert();

        By btnSkip = By.id("com.iitdh.sonusourav.instigo:id/btn_skip");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSkip));
        driver.findElement(btnSkip).click();


        MobileElement txtUserName = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_user_name");
        txtUserName.click();
        txtUserName.sendKeys("cja@mailinator.com");

        MobileElement txtPassword = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/ed_password");
        txtPassword.click();
        txtPassword.sendKeys("Qwerasdf");

        MobileElement chkRememberMe = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/remember_me_chk_box");
        chkRememberMe.click();

        MobileElement btnLogin = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/button_login");
        btnLogin.click();


        MobileElement btnTileComplaint = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/imagebt_bp");
        btnTileComplaint.click();

        MobileElement btnRegisterComplaint = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/maintenance_register");
        btnRegisterComplaint.click();

        MobileElement txtName = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/complain_username");
        txtName.sendKeys("chathura");

        MobileElement txtTitle = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/complain_title");
        txtTitle.sendKeys("chathuraTitle");

        MobileElement txtHouseNumber = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/complain_house_no");
        txtHouseNumber.sendKeys("456");

        MobileElement drpHostel = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/add_complaint_hostel");
        drpHostel.click();

        MobileElement lblHostel5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]");
        lblHostel5.click();

        MobileElement drpComplaintType = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/add_complaint_type");
        drpComplaintType.click();

        MobileElement lblCarPenter = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        lblCarPenter.click();


        MobileElement txtComplaintDescription = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/et_complain_desc");
        txtComplaintDescription.sendKeys("Please fix the chair");

        MobileElement btnSubmit = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/complain_submit");
        btnSubmit.click();

        MobileElement btnComplaintStatus = (MobileElement) driver.findElementById("com.iitdh.sonusourav.instigo:id/maintenance_status");
        btnComplaintStatus.click();


        Boolean isNewComplaintAvilable = false;
        for (int i = 0 ; i<5; i++)
        {
            List<MobileElement> elm = driver.findElementsById("com.iitdh.sonusourav.instigo:id/status_complain_title");

            for (MobileElement chathura :elm) {
                if (chathura.getText().equals("chathuraTitlezzzzz"))
                {
//                    softAssert.assertTrue(true);
                    isNewComplaintAvilable = true;
//                    i = 1000;
                    break;
                }
//                else {
//                    softAssert.assertTrue(false);
//
//                }
            }
            scroll();
        }

        softAssert.assertTrue(isNewComplaintAvilable);

        softAssert.assertAll();
    }

    public void scroll()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        (new TouchAction(driver)).press(PointOption.point(531,1955)).moveTo(PointOption.point(531, 900)).release().perform();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }





    //@AfterTest
    public void tearDown() {
        driver.quit();
    }

}
