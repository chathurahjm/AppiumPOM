package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    private AndroidDriver chatura;
    public loginPage(AndroidDriver driver) {
        this.chatura = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/ed_user_name")
    private AndroidElement txtUserName;
    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/ed_password")
    private AndroidElement txtPassword;

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/remember_me_chk_box")
    private AndroidElement chkBoxRememberMe;

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/button_login")
    private AndroidElement btnLogin;


    public void entrtUserName()
    {
        txtUserName.sendKeys("cja@mailinator.com");
    }

    public void enterPassword()
    {
        txtPassword.sendKeys("Qwerasdf");
    }

    public void loginTotheSystemWithValidUserNameAndPassword()
    {
        txtUserName.sendKeys("cja@mailinator.com");
        txtPassword.sendKeys("Qwerasdf");
        chkBoxRememberMe.click();
        btnLogin.click();


    }
}
