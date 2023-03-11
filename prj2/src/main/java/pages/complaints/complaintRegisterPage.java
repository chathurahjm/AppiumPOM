package pages.complaints;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class complaintRegisterPage {
    private AndroidDriver driver;

    public complaintRegisterPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/complain_username")
    private AndroidElement txtComplaintName;
    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/complain_title")
    private AndroidElement txtComplaintTitle;
    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/complain_house_no")
    private AndroidElement tctHouseNo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Spinner[1]/android.widget.TextView")
    private AndroidElement drpHostelList;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")
    private AndroidElement drpHostelList_txtHostelItem5;

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/add_complaint_type")
    private AndroidElement txtComplaint_type;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")
    private AndroidElement txtComplaint_type_Item3;

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/et_complain_desc")
    private AndroidElement et_complain_desc;

    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/complain_submit")
    private AndroidElement btnSubmit;


    public void createANewCompalint(String complaintName)
    {

        txtComplaintName.sendKeys("Chathura");
        txtComplaintTitle.sendKeys(complaintName);
        tctHouseNo.sendKeys("abc123");
        drpHostelList.click();
        drpHostelList_txtHostelItem5.click();
        txtComplaint_type.click();
        txtComplaint_type_Item3.click();
        et_complain_desc.sendKeys("Description");
        btnSubmit.click();


    }

    public void createANewCompalintWithOutEnteringName()
    {
        txtComplaintTitle.sendKeys("TestCJa_ Title");
        tctHouseNo.sendKeys("abc123");
        drpHostelList.click();
        drpHostelList_txtHostelItem5.click();
        txtComplaint_type.click();
        txtComplaint_type_Item3.click();
        et_complain_desc.sendKeys("Description");
        btnSubmit.click();


    }
}


