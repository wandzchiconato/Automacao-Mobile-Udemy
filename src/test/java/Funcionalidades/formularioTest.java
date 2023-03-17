package Funcionalidades;


import appiumCore.baseTest;
import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.formularioPage;
import page.menuPage;

import java.net.MalformedURLException;

public class formularioTest extends baseTest {


    private menuPage menu = new menuPage();
    private formularioPage page = new formularioPage();


    @Before

    public void inicializarAppium() throws MalformedURLException {


        menu.acessarFormulario();


    }

    @Test
    public void realizarCadastro() throws MalformedURLException {


        page.validarTituloTela();


        page.escreverTexto("CadastroWandz");


        Assert.assertEquals("CadastroWandz", page.obterNome());


        page.selecionarCombo("Nintendo Switch");


        page.validarTextoCombo();
        Assert.assertEquals("Nintendo Switch", page.validarTextoCombo());


        Assert.assertFalse(page.isCheckedMarcado());
        Assert.assertTrue(page.isSwitchMarcado());


        page.clicarCheck();
        page.clicarSwitch();


        Assert.assertTrue(page.isCheckedMarcado());
        Assert.assertTrue(page.isCheckedMarcado());


        page.salvar();


        Assert.assertEquals("Nome: CadastroWandz", page.validarNomeCadastrado());

        Assert.assertEquals("Console: switch", page.validarConsoleCadastrado());


        Assert.assertEquals("Switch: Off", page.obterSwitchCadastrado());


        Assert.assertEquals("Checkbox: Marcado", page.obterCheckCadastrado());

    }

    @Test
    public void cadastroDemorado() throws MalformedURLException {

        page.validarTituloTela();
        page.escreverTexto("CadastroWandz");
        Assert.assertEquals("CadastroWandz", page.obterNome());
        page.selecionarCombo("Nintendo Switch");
        page.validarTextoCombo();
        Assert.assertEquals("Nintendo Switch", page.validarTextoCombo());
        Assert.assertFalse(page.isCheckedMarcado());
        Assert.assertTrue(page.isSwitchMarcado());

        page.clicarCheck();
        page.clicarSwitch();


        Assert.assertTrue(page.isCheckedMarcado());
        Assert.assertTrue(page.isCheckedMarcado());


        page.salvarDemorado();

        Assert.assertEquals("Nome: CadastroWandz", page.validarNomeCadastrado());
        Assert.assertEquals("Console: switch", page.validarConsoleCadastrado());
        Assert.assertEquals("Switch: Off", page.obterSwitchCadastrado());
        Assert.assertEquals("Checkbox: Marcado", page.obterCheckCadastrado());

    }

    @Test

    public void deveAlterarData() {
        page.clicarPorTexto("01/01/2000");
        page.clicarPorTexto("7");
        page.clicarPorTexto("OK");
        Assert.assertTrue(page.existeElementoPorTexto("07/01/2000"));
    }

    @Test

    public void deveAlterarHora() {
        page.clicarPorTexto("09:00");
        page.clicar(MobileBy.AccessibilityId("8"));
        page.clicar(MobileBy.AccessibilityId("35"));
        page.clicarPorTexto("OK");

    }

    @Test
    public void deveInteragirComSeekBar(){
    page.clicarSeekBar(0.2);
    page.salvar();

    }


}

