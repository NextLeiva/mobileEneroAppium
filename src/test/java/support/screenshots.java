package support;

import definitions.Hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class screenshots {
    public static void captura() throws IOException {
        String ruta="/Users/joel/Documents/Automatizacion/mobileEnero";
        String nombre_captura=ruta+"screenshot.jpg";
        File srcFile = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File(nombre_captura));
    }

}
