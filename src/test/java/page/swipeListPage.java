package page;

import appiumCore.basePage;
import appiumCore.driverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import static appiumCore.driverFactory.getDriver;

public class swipeListPage extends basePage {

    public void swipeElementLeft(String opcao){

        swipeElement(getDriver().findElement(By.xpath("//*[@text='"+ opcao +"']/..")), 0.1,0.9);
    }
    public void swipeElementRight(String opcao){

        swipeElement(getDriver().findElement(By.xpath("//*[@text='"+ opcao +"']/..")), 0.9,0.1);
    }

    public void clicarBotaoMais(){
        MobileElement botao = getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
        new TouchAction(getDriver())
                .tap(PointOption.point(-50,0)).perform();
    }
}
