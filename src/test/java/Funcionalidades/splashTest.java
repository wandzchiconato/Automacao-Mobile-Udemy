package Funcionalidades;

import appiumCore.baseTest;
import org.junit.Assert;
import org.junit.Test;
import page.menuPage;
import page.splashPage;

public class splashTest extends baseTest {

    private menuPage menu = new menuPage();
    private splashPage page = new splashPage();

    @Test
    public void aguardarSplashSumir() {
        menu.acessarSplash();
        page.isTelaSplashVisivel();
        page.aguardarSplashSumir();
        Assert.assertTrue(page.existeElementoPorTexto("Formulário"));


    }
}
