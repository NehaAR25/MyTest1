package project.my.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import project.my.utilities.Utility;

public class BaseTest extends Utility {
    String browser = "Chrome";
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);

    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
