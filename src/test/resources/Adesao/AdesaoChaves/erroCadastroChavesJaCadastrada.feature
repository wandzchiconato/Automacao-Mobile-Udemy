Feature: Cadastro de Chaves CPF Cenario de erros

  Scenario: Validar o cadastro de um CPF j� Cadastrado
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave CPF
    And Seleciona o Bot�o CONTINUAR
    And Informa o CPF j� cadastrado
    Then apresenta a mensagem CPF Ja Cadastrado

  Scenario: Validar o cadastro de um e-mail j� Cadastrado
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
    And Seleciona a Op��o CADASTRAR CHAVE
    Then apresenta a mensagem E-mail Ja Cadastrado

  Scenario: Validar o cadastro de um Celular j� Cadastrado
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
    Then apresenta a mensagem Celular Ja Cadastrado





