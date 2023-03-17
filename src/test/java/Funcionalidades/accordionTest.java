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
        Assert.assertEquals("Opção 1",page.validarAccordions1());
        page.clicarAccordion1();
        Assert.assertEquals("Esta é a descrição da opção 1", page.validarAccordion1Expandido());
        page.recolherAccordion1();

    }

}
