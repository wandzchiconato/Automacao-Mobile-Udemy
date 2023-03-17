package appiumCore;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

import static appiumCore.driverFactory.getDriver;
import static io.appium.java_client.touch.offset.PointOption.point;

//PAGINA PARA ESCREVER AS FUNÇÕES NO APP
public class basePage {

    public void escrever(By by, String texto) {
        getDriver().findElement(by).sendKeys(texto);

    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();

    }

    public void clicar(By by) {
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto) {
        clicar(By.xpath("//*[@text='" + texto + "']"));

    }

    public void toque(int x, int y) {
        AndroidTouchAction touch = new AndroidTouchAction(getDriver());
        touch.press(point(x, y))
                .perform();
    }


    public void selecionarCombo(By by, String valor) {

        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    public boolean isCheckMarcado(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("true");

    }

    public boolean existeElementoPorTexto(String texto) {
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));
        return ((List<?>) elementos).size() > 0;
    }

    public void scrollDown() {
        scroll(0.9, 0.3);
    }

    public void scrollUP() {
        scroll(0.3, 0.9);
    }

    public void swipeLeft() {
        swipe(0.1, 0.9);
    }

    public void swipeRight() {
        swipe(0.9, 0.1);
    }

    public void scroll(double inicio, double fim) {

        Dimension size = getDriver().manage().window().getSize();
        int x = size.width / 2;

        int start_y = (int) (size.height * inicio);
        int end_y = (int) (size.height * fim);


        new TouchAction(getDriver())
                .press(PointOption.point(x, end_y))
                .moveTo(PointOption.point(x, start_y))
                .release()
                .perform();

    }

    public void swipe(double inicio, double fim) {

        Dimension size = getDriver().manage().window().getSize();
        int y = size.height / 2;

        int start_x = (int) (size.width * inicio);
        int end_x = (int) (size.width * fim);


        new TouchAction(getDriver())
                .longPress(point(start_x, y))
                .moveTo(point(end_x, y))
                .release()
                .perform();

    }

    public void swipeElement(MobileElement element, double inicio, double fim) {

        int y = element.getLocation().y + (element.getSize().height / 2);

        int start_x = (int) (element.getSize().width * inicio);
        int end_x = (int) (element.getSize().width * fim);


        new TouchAction(getDriver())
                .longPress(point(start_x, y))
                .moveTo(point(end_x, y))
                .release()
                .perform();

    }


    public String obterTitulo() {
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagem() {
        return obterTexto(By.id("android:id/message"));

    }


}

