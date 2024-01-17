package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
    private AndroidDriver drv;
    //tiempo de espera que utiliza appium que espera que tu objeto carguen
    private WebDriverWait wait;

    @AndroidFindBy(accessibility = "username")
    protected static AndroidElement txtUsername;
    @AndroidFindBy(accessibility = "password")
    protected static AndroidElement txtPassword;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOG IN']")
    protected static AndroidElement btnLogin;

    //constructor
    public loginPage(AndroidDriver driver) {
        drv = driver;
        //a cada objeto le digo con que navegador o pantalla voy a trabajar
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver,30);
    }

    public void escribirUsuario(String texto){
        //hasta que este visible el objeto
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.clear();
        //txtUsername.sendKeys();
        txtUsername.setValue(texto);
    }
    public void escribirPassword(String texto){
        txtPassword.clear();
        txtPassword.setValue(texto);
    }
    public void clickLogin(){
        btnLogin.click();
    }

}
