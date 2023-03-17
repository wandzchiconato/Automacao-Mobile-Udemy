package page;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class alertaPage extends basePage {

    public void clicarAlertaSimples(){
        clicarPorTexto("ALERTA SIMPLES");

    }
    public void clicarAlertaConfirm(){
        clicarPorTexto("ALERTA CONFIRM");
    }



    public void clicarAlertaConfirmar(){
        clicar(By.id("android:id/button2"));
    }

    public void clicarAlertaSair(){
        clicar(By.id("android:id/button1"));
    }


public void clicarForaCaixa(){
        toque(100, 150);

}
}
