package definitions;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    //variable publica que se pueda ver cualqueir lugar
    public static AndroidDriver driver;
    //IOSDriver para ios

    //Antes que inicie la pruebas asigna los capabilities
    @Before
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulador");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability("appPackage","com.vodqareactnative");
        capabilities.setCapability("appActivity","com.vodqareactnative.MainActivity");
        capabilities.setCapability(MobileCapabilityType.APP,"/Users/joel/Documents/Automatizacion/mobileEnero/src/test/resources/app/VodQA.apk");


        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
    @After
    public static void tearDown(){
        driver.quit();
    }




}
