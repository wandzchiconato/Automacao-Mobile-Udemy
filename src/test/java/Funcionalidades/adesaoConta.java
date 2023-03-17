package Funcionalidades;

import appiumCore.basePage;
import appiumCore.baseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;
import page.telaInicialPage;

public class adesaoConta extends baseTest {
    public telaInicialPage page = new telaInicialPage();


    @Test
    @Given("^usuario acessa o App Maps$")
    public void usuarioAcessaOAppMaps() {
    }

    @When("^seleciona a opção criar conta$")
    public void selecionaAOpçãoCriarConta() {

        page.criarConta();

    }


//    @And("^Digita o CPF$")
//    public void digitaOCPF() {
//    }
//
//    @And("^Seleciona o botao Continuar$")
//    public void selecionaOBotaoContinuar() {
//    }
//
//    @And("^Digita seu Nome Completo$")
//    public void digitaSeuNomeCompleto() {
//    }
//
//    @And("^Digita seu Celular$")
//    public void digitaSeuCelular() {
//    }
//
//    @And("^Digita o codigo de validacao de posse$")
//    public void digitaOCodigoDeValidacaoDePosse() {
//    }
//
//    @And("^Informa a sua Data de Nascimento$")
//    public void informaASuaDataDeNascimento() {
//    }
//
//    @And("^Informa o Nome Completo da Mãe$")
//    public void informaONomeCompletoDaMãe() {
//    }
//
//    @And("^Informa o seu email$")
//    public void informaOSeuEmail() {
//    }
//
//    @And("^Tira a foto da parte de frente do Documento$")
//    public void tiraAFotoDaParteDeFrenteDoDocumento() {
//    }
//
//    @And("^seleciona Tirar Foto$")
//    public void selecionaTirarFoto4() {
//    }
//
//    @And("^Tira a foto da parte de tras do Documento$")
//    public void tiraAFotoDaParteDeTrasDoDocumento() {
//    }
//
//    @And("^Posiciona o rosto na area exibida$")
//    public void posicionaORostoNaAreaExibida() {
//    }
//
//    @And("^seleciona tirar foto$")
//    public void selecionaTirarFoto2() {
//    }
//
//    @And("^Digita o CEP$")
//    public void digitaOCEP() {
//    }
//
//    @And("^clica na Lupa$")
//    public void clicaNaLupa() {
//    }
//
//    @And("^Seleciona o endereço correspondente a sua pesquisa$")
//    public void selecionaOEndereçoCorrespondenteASuaPesquisa() {
//    }
//
//    @And("^digita o o numero da residencia$")
//    public void digitaOONumeroDaResidencia() {
//    }
//
//    @And("^digita a senha$")
//    public void digitaASenha() {
//    }
//
//    @And("^Confirme a senha$")
//    public void confirmeASenha() {
//    }
//
//    @And("^Valida o termo$")
//    public void validaOTermo() {
//    }
//
//    @Then("^Selecionar Aceitar e finalizar$")
//    public void selecionarAceitarEFinalizar() {
//    }
}
