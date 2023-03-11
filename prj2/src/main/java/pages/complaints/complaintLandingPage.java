package pages.complaints;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class complaintLandingPage {
    private AndroidDriver driver;

    public complaintLandingPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/maintenance_register")
    private AndroidElement btnRegisterComplaint;
    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/maintenance_status")
    private AndroidElement btnStatus;

    public void tapOnRegisterComplaintButton()
    {
        btnRegisterComplaint.click();
    }

    public void tapOnComplaintList()
    {
        btnStatus.click();
    }
}
