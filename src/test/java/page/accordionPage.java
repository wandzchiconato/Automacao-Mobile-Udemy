package page;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class accordionPage extends basePage {

    public String validarAccordions1() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Opção 1']"));


    }

    public void clicarAccordion1() {
        clicarPorTexto("Opção 1");
    }

    public String validarAccordion1Expandido() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 1']"));

    }

    public void recolherAccordion1() {
        clicarPorTexto("Opção 1");
    }
}
