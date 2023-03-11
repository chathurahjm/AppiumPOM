package pages.complaints;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class complaintListPage {
    private AndroidDriver driver;

    public complaintListPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    //Driver.find element <- single element
    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/et_complain_desc")
    private AndroidElement et_complain_desc;

    //Driver.find elements <- Multiple elements
    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/status_complain_title")
    private List<AndroidElement> lblCOmplaintStatusTitle;


    public Boolean isTitleAvailableAtTheComplaintList(String ComplaintName)
    {
    Boolean isNewComplaintAvilable = false;
        for (int i = 0 ; i<5; i++)
        {
            List<MobileElement> elm = driver.findElementsById("com.iitdh.sonusourav.instigo:id/status_complain_title");

            for (MobileElement chathura :elm) {
                if (chathura.getText().equals(ComplaintName))
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

        return isNewComplaintAvilable;
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

}
