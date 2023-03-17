package Funcionalidades;

import appiumCore.baseTest;
import org.junit.Assert;
import org.junit.Test;
import page.abasPage;
import page.menuPage;


public class abasTest extends baseTest {
    private menuPage menu = new menuPage();
    private abasPage page = new abasPage();


    @Test
public void deveInteragirComAbas(){
        menu.acessarAbas();

        Assert.assertEquals("Este é o conteúdo da Aba 1",page.validarAba1());
        Assert.assertEquals("Aba 1", page.validarTituloBotaoAba1());
        page.clicarAba2();
        Assert.assertEquals("Este é o conteúdo da Aba 2", page.validarAba2());
        Assert.assertEquals("Aba 2",page.validarTituloBotaoAba2());



}


}
