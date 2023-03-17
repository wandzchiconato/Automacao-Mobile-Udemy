package Funcionalidades;

import appiumCore.baseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.alertaPage;
import page.menuPage;

public class alertaTest extends baseTest {
    private menuPage menu = new menuPage();
    private alertaPage page = new alertaPage();
    @Before
    public void setup(){
        menu.acessarAlertas();
    }



    @Test
    public void deveConfirmarAlerta() {

        //clicar em alerta confirm
        page.clicarAlertaConfirm();
        //verificar os textos
        Assert.assertEquals("Info", page.obterTitulo());
        Assert.assertEquals("Confirma a operação?", page.obterMensagem());
        //confirmar alerta
        page.clicarAlertaConfirmar();
        //verificar nova mensagem
        Assert.assertEquals("Info", page.obterTitulo());
        Assert.assertEquals("Confirmado", page.obterMensagem());
        //sair
        page.clicarAlertaSair();

    }
@Test
    public void deveCLicarForaAlerta() throws InterruptedException {
        page.clicarAlertaSimples();
        Assert.assertEquals("Info", page.obterTitulo());
        Assert.assertEquals("Pode clicar no OK ou fora da caixa para sair", page.obterMensagem());
        page.clicarForaCaixa();
        Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
    }

}
