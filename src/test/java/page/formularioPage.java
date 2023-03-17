package page;

import appiumCore.basePage;
import appiumCore.driverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.tap;

public class formularioPage extends basePage {


    //Validar Titulo da  Tela

    public String validarTituloTela() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='CT Appium']"));


    }

    public void escreverTexto(String nome) {

        escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public String obterNome() {
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor) {
        selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String validarTextoCombo() {
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck() {
        clicar(By.className("android.widget.CheckBox"));

    }

    public void clicarSwitch() {
        clicar(MobileBy.AccessibilityId("switch"));
    }

    public boolean isCheckedMarcado() {
        return isCheckMarcado(By.className("android.widget.CheckBox"));

    }

    public boolean isSwitchMarcado() {
        return isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public void clicarSeekBar(Double posicao) {
        int delta = 1;
        MobileElement seek = driverFactory.getDriver().findElement(MobileBy.AccessibilityId("slid"));
        int y = seek.getLocation().y + (seek.getSize().height / 2);
        System.out.println(y);
        int xinicial = seek.getLocation().x + delta;
        int x = (int) (xinicial + ((seek.getSize().width - 2*delta)* posicao));
        System.out.println(x);

        toque(x, y);

    }

    public void salvar() {
        clicarPorTexto("SALVAR");
    }

    public void salvarDemorado() {
        clicarPorTexto("SALVAR DEMORADO");
    }

    public String validarNomeCadastrado() {

        return obterTexto(By.xpath("//android.widget.TextView[@text='Nome: CadastroWandz']"));


    }

    public String validarConsoleCadastrado() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Console: switch']"));
    }

    public String obterCheckCadastrado() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Checkbox: Marcado']"));
    }

    public String obterSwitchCadastrado() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Switch: Off']"));


    }

}


