package page;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class telaInicialPage extends basePage {


    public void acessarLogin() {
        clicar(By.id("com.maps.pixmapsfake:id/buttonAlreadyAccount"));
    }

    public void criarConta(){
        clicar(By.id("com.maps.pixmapsfake:id/buttonCreateAccount"));
    }
}
