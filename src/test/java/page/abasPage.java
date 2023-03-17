package page;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class abasPage extends basePage {
    public String validarAba1() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 1']"));

    }

    public String validarTituloBotaoAba1() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Aba 1']"));

    }

    public void clicarAba2() {
        clicarPorTexto("Aba 2");

    }

    public String validarAba2() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 2']"));

    }

    public String validarTituloBotaoAba2() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Aba 2']"));

    }
}
