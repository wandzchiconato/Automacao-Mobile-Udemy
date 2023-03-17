Feature: Solicita��o de Portabilidade

  Scenario: Solicitar a Portabilidade de uma Chave CPF
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave CPF
    And Seleciona o Bot�o CONTINUAR
    And Informa o CPF que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    Then Seleciona o bot�o SIM na tela de portabilidade

  Scenario: Solicitar a Portabilidade de uma Chave Celular
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave Celular
    And Seleciona o Bot�o CONTINUAR
    And Informa o numero do celular que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    And Informa o C�digo de Valida��o de Posse recebido via SMS
    Then Seleciona o bot�o SIM na tela de portabilidade


  Scenario: Solicitar a Portabilidade de uma Chave E-Mail
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave E-Mail
    And Seleciona o Bot�o CONTINUAR
    And Informa o endere�o de E-Mail que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    And Informa o C�digo de Valida��o de Posse recebido via Email
    Then Seleciona o bot�o SIM na tela de portabilidade
