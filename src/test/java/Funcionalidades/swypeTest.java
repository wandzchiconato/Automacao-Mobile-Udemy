package Funcionalidades;

import appiumCore.basePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.menuPage;

public class swypeTest extends basePage {

    private menuPage menu = new menuPage();

    @Test
    public void efetuarSwype() {
        menu.acessarSwype();
        Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
        menu.swipeRight();
        Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
        menu.swipeRight();
        Assert.assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
        menu.swipeLeft();
        Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
        menu.swipeLeft();
        Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
    }

}
