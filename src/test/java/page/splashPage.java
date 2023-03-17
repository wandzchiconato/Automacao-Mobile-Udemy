package page;

import appiumCore.basePage;
import appiumCore.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static appiumCore.driverFactory.getDriver;

public class splashPage extends basePage {



    public boolean isTelaSplashVisivel() {
        return existeElementoPorTexto("Splash!");
    }

    public void aguardarSplashSumir(){
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));

    }
}
