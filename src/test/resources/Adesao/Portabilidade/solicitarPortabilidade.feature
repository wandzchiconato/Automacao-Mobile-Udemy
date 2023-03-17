Feature: Solicitação de Portabilidade

  Scenario: Solicitar a Portabilidade de uma Chave CPF
    Given Que o Usuario está na Home do App
    When seleciona a Opção Minhas Chaves
    And É exibido a tela de Gerenciamento de Chaves
    And Seleciona o Botão CADASTRAR CHAVE
    And Seleciona a opção de Chave CPF
    And Seleciona o Botão CONTINUAR
    And Informa o CPF que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Botão CONFIRMAR
    Then Seleciona o botão SIM na tela de portabilidade

  Scenario: Solicitar a Portabilidade de uma Chave Celular
    Given Que o Usuario está na Home do App
    When seleciona a Opção Minhas Chaves
    And É exibido a tela de Gerenciamento de Chaves
    And Seleciona o Botão CADASTRAR CHAVE
    And Seleciona a opção de Chave Celular
    And Seleciona o Botão CONTINUAR
    And Informa o numero do celular que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Botão CONFIRMAR
    And Informa o Código de Validação de Posse recebido via SMS
    Then Seleciona o botão SIM na tela de portabilidade


  Scenario: Solicitar a Portabilidade de uma Chave E-Mail
    Given Que o Usuario está na Home do App
    When seleciona a Opção Minhas Chaves
    And É exibido a tela de Gerenciamento de Chaves
    And Seleciona o Botão CADASTRAR CHAVE
    And Seleciona a opção de Chave E-Mail
    And Seleciona o Botão CONTINUAR
    And Informa o endereço de E-Mail que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Botão CONFIRMAR
    And Informa o Código de Validação de Posse recebido via Email
    Then Seleciona o botão SIM na tela de portabilidade
