package Funcionalidades;

import appiumCore.basePage;
import appiumCore.baseTest;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import page.cliquesPage;
import page.menuPage;

public class cliquesTest extends baseTest {

    private menuPage menu = new menuPage();

    private cliquesPage page = new cliquesPage();

    @Before
    public void setup() {
        menu.acessarCliques();
    }


    @Test
    public void deveRealizarCliqueLongo() {
        page.cliqueLongo();
        Assert.assertEquals("Clique Longo", page.obterTextoCampoDuplo());


    }

    @Test
    public void deveRealizarCliqueDuplo() {
        page.clicarPorTexto("Clique duplo");
        page.clicarPorTexto("Clique duplo");
        Assert.assertEquals("Duplo Clique", page.obterTextoCampo());

    }

}
