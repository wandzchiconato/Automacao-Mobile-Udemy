Feature: Ades�o de Chaves Exibindo Onboarding

  Scenario: Adesao de Chaves Pix CPF validando Onboarding e compartilhando o Comprovante
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a primeira tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a segunda tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a terceira tela de Onboarding
    And seleciona o Bot�o ENTENDI
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


  Scenario: Adesao de Chaves Pix Celular validando Onboarding e o bot�o Copiar Chave Pix
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a primeira tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a segunda tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a terceira tela de Onboarding
    And seleciona o Bot�o ENTENDI
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave Celular
    And Seleciona o Bot�o CONTINUAR
    And Informa o numero do celular que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    And Informa o C�digo de Valida��o de Posse recebido
    Then Seleciona a Op��o COPIAR CHAVE PIX

  Scenario: Adesao de Chaves Pix E-mail validando Onboarding e o bot�o Cadastrar Chave
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a primeira tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a segunda tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a terceira tela de Onboarding
    And seleciona o Bot�o ENTENDI
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave E-Mail
    And Seleciona o Bot�o CONTINUAR
    And Informa o endere�o de E-Mail que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    And Informa o C�digo de Valida��o de Posse recebido
    Then Seleciona a Op��o CADASTRAR CHAVE

  Scenario: Adesao de Chaves Pix Aleat�ria validando Onboarding e o bot�o Compartilhar
    Given Que o Usuario est� na Home do App
    When seleciona a Op��o Minhas Chaves
    And � exibido a primeira tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a segunda tela de Onboarding
    And Efetua um Swipe para a esquerda para exibir a terceira tela de Onboarding
    And seleciona o Bot�o ENTENDI
    And � exibido a tela de Gerenciamento de Chaves
    And Seleciona o Bot�o CADASTRAR CHAVE
    And Seleciona a op��o de Chave E-Mail
    And Seleciona o Bot�o CONTINUAR
    And Informa o endere�o de E-Mail que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Bot�o CONFIRMAR
    And Informa o C�digo de Valida��o de Posse recebido
    Then Seleciona a Op��o CADASTRAR CHAVE
