//Nucleo para chamar o Appium

package appiumCore;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//Classe responsavel com o Núcleo do Appium
public class driverFactory {

    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver()  {
        if (driver == null) {
            createDriver();

        }
        return driver;
    }


    private static void createDriver()  {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("appium:platformVersion", "13.0");
        desiredCapabilities.setCapability("appium:appPackage", "com.maps.pixmapsfake");
        desiredCapabilities.setCapability("appium:appActivity", "com.maps.pixmaps.MainActivity");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        URL remote = null;
        try {
           driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }
}

