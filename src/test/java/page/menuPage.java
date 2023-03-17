package page ;

import appiumCore.basePage;

public class menuPage extends basePage {


    public void acessarFormulario(){

        clicarPorTexto("Formulário");
    }

    public void acessarSplash(){
        clicarPorTexto("Splash");
    }

    public void acessarAlertas(){
        clicarPorTexto("Alertas");
    }

    public void acessarAbas(){
        clicarPorTexto("Abas");
    }

    public void acessarAccordion(){
        clicarPorTexto("Accordion");
    }

    public void acessarCliques(){
        clicarPorTexto("Cliques");
    }

    public void acessarSwype(){
        clicarPorTexto("Swipe");
    }

    public void acessarSwypeList(){
        clicarPorTexto("Swipe List");
    }

}
