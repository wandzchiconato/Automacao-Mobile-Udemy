package page;

import appiumCore.basePage;
import appiumCore.driverFactory;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.sql.Driver;

import static appiumCore.driverFactory.getDriver;

public class cliquesPage extends basePage {

    public void cliqueLongo() {
        WebElement first = getDriver().findElementByXPath("//android.widget.TextView[@text='Clique Longo']");
        TouchAction action = new TouchAction(driverFactory.getDriver());
        action.longPress(new LongPressOptions().withElement(new
                ElementOption().withElement(first))).perform();


    }

    public String obterTextoCampoDuplo(){
        return obterTexto(By.xpath("//android.widget.TextView[@text='Clique Longo']"));

    }

    public String obterTextoCampo(){
        return obterTexto(By.xpath("//android.widget.TextView[@text='Duplo Clique']"));

    }


}
