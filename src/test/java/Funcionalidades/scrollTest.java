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
        menu.clicarPorTexto("Op��o bem escondida");
        Assert.assertEquals("Voc� achou essa op��o", menu.obterMensagem());
        menu.clicarPorTexto("OK");





    }
}
