package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class splashPage {

    private AndroidDriver driver;

    public splashPage(AndroidDriver driver) {
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @AndroidFindBy(id = "com.iitdh.sonusourav.instigo:id/btn_skip")
    private AndroidElement btnSkip;


    public void clickOnSkipButton()
    {
        btnSkip.click();
    }
}
