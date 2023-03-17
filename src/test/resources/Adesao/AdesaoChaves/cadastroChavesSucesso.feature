Feature: Cadastro de Chaves

  Scenario: Cadastro de Chaves Pix CPF e compartilhando o Comprovante
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave CPF
    And Seleciona o Bot�o CONTINUAR
    And Informa o CPF que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    And Seleciona a Op��o Ver comprovante
    And Seleciona a Op��o Compartilhar
    Then Selecione qual APP para compartilhar o comprovante


  Scenario: Cadastro de Chaves Pix Celular e o bot�o Copiar Chave Pix
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
    Then Seleciona a Op��o COPIAR CHAVE PIX


  Scenario: Cadastro de Chaves Pix E-mail
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
    Then Seleciona a Op��o CADASTRAR CHAVE

  Scenario: Cadastro de Chaves Pix Aleat�ria
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave E-Mail
    And Seleciona o Bot�o CONTINUAR
    And Informa o endere�o de E-Mail que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    Then Seleciona a Op��o CADASTRAR CHAVE