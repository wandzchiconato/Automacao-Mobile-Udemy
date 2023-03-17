package Funcionalidades;

import appiumCore.basePage;
import org.junit.Assert;
import org.testng.annotations.Test;
import page.menuPage;

@Test
public class scrollTest extends basePage {

    private menuPage menu = new menuPage();

    public void scrollDown(){
        menu.scrollUP();
        menu.clicarPorTexto("Opção bem escondida");
        Assert.assertEquals("Você achou essa opção", menu.obterMensagem());
        menu.clicarPorTexto("OK");





    }
}
