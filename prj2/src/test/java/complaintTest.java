import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.appHomePage;
import pages.complaints.complaintLandingPage;
import pages.complaints.complaintListPage;
import pages.complaints.complaintRegisterPage;
import pages.loginPage;
import pages.splashPage;

import java.util.Date;

public class complaintTest extends TestBase{

    @Test
    public void validateUserCanSuccessfullyCreateAComplaint()
    {
        Date date = new Date();
        String complaintTitle = "Cha"+date.toString();
        System.out.println(complaintTitle);
        SoftAssert softAssert = new SoftAssert();
        splashPage splashPage = new splashPage(driver);
        splashPage.clickOnSkipButton();

        loginPage loginPage = new loginPage(driver);
        loginPage.loginTotheSystemWithValidUserNameAndPassword();

        appHomePage appHomePage = new appHomePage(driver);
        appHomePage.tapOnComplaintIcon();

        complaintLandingPage complaintLandingPage = new complaintLandingPage(driver);
        complaintLandingPage.tapOnRegisterComplaintButton();

        complaintRegisterPage complaintRegisterPage = new complaintRegisterPage(driver);
        complaintRegisterPage.createANewCompalint(complaintTitle);

        complaintLandingPage.tapOnComplaintList();

        complaintListPage complaintListPage = new complaintListPage(driver);
        //Boolean output = complaintListPage.isTitleAvailableAtTheComplaintList();

        softAssert.assertTrue(complaintListPage.isTitleAvailableAtTheComplaintList(complaintTitle));

        softAssert.assertAll();




    }
}
