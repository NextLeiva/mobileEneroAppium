package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class loginPage {
    private AndroidDriver drv;

    @AndroidFindBy(accessibility = "username")
    protected static AndroidElement txtUsername;
    @AndroidFindBy(accessibility = "password")
    protected static AndroidElement txtPassword;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOG IN']")
    protected static AndroidElement btnLogin;

    //constructor
    public loginPage(AndroidDriver driver) {
        drv = driver;
    }

}
