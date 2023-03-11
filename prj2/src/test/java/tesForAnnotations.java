import org.testng.annotations.*;

public class tesForAnnotations {

    @Test
    public void anotationTest()
    {
        System.out.println("this is out fist test");
    }

    @Test
    public void anotationTest2()
    {
        System.out.println("this is out fist test");
    }
    @AfterTest
    public void anotationTest3()
    {
        System.out.println("this is out fist test");
    }
    @AfterMethod
    public void anotationTest4()
    {
        System.out.println("this is out fist test");
    }
    @BeforeTest
    public void anotationTest5()
    {
        System.out.println("this is out fist test");
    }

    @BeforeMethod
    public void anotationTest6()
    {
        System.out.println("this is out fist test");
    }

}
