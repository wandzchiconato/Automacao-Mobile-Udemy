package Funcionalidades;

import appiumCore.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.menuPage;
import page.swipeListPage;

public class swipeElementTest extends baseTest {
    private menuPage menu = new menuPage();
    private swipeListPage swipe = new swipeListPage();
    @Test
    public void interacaoSwipe(){
        menu.acessarSwypeList();
        swipe.swipeElementRight("Opção 1");
        //swipe.clicarBotaoMais();
        //Assert.assertTrue(menu.existeElementoPorTexto("Opção 1 (+)"));
        swipe.swipeElementRight("Opção 4");
        menu.clicarPorTexto("(-)");
        //Assert.assertTrue(menu.existeElementoPorTexto("Opção 4 (-)"));
        swipe.swipeElementLeft("Opção 5");
       // Assert.assertTrue(menu.existeElementoPorTexto("Opção 5 (-)"));
    }

}
