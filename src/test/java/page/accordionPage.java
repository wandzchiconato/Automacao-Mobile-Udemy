package page;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class accordionPage extends basePage {

    public String validarAccordions1() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Op��o 1']"));


    }

    public void clicarAccordion1() {
        clicarPorTexto("Op��o 1");
    }

    public String validarAccordion1Expandido() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Esta � a descri��o da op��o 1']"));

    }

    public void recolherAccordion1() {
        clicarPorTexto("Op��o 1");
    }
}
