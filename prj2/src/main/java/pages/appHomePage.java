package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class appHomePage {

    private AndroidDriver driver;

    public appHomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/imagebt_bp")
    private AndroidElement btnimgeComplain;

    public void tapOnComplaintIcon()
    {
        btnimgeComplain.click();
    }
}
