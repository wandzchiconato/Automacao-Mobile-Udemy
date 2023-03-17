package Funcionalidades;

import appiumCore.baseTest;
import org.junit.Assert;
import org.junit.Test;
import page.accordionPage;
import page.menuPage;

public class accordionTest extends baseTest {
    private menuPage menu = new menuPage();
    private accordionPage page = new accordionPage();

@Test
    public void interagirComAccordion(){
        menu.acessarAccordion();
        Assert.assertEquals("Op��o 1",page.validarAccordions1());
        page.clicarAccordion1();
        Assert.assertEquals("Esta � a descri��o da op��o 1", page.validarAccordion1Expandido());
        page.recolherAccordion1();

    }

}
