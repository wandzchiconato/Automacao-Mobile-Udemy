Feature: Cadastro de Chaves

  Scenario: Cadastro de Chaves Pix CPF e compartilhando o Comprovante
    Given Que o Usuario está na Home do App
    When seleciona a Opção Minhas Chaves
    And É exibido a tela de Gerenciamento de Chaves
    And Seleciona o Botão CADASTRAR CHAVE
    And Seleciona a opção de Chave CPF
    And Seleciona o Botão CONTINUAR
    And Informa o CPF que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Botão CONFIRMAR
    And Seleciona a Opção Ver comprovante
    And Seleciona a Opção Compartilhar
    Then Selecione qual APP para compartilhar o comprovante


  Scenario: Cadastro de Chaves Pix Celular e o botão Copiar Chave Pix
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
    Then Seleciona a Opção COPIAR CHAVE PIX


  Scenario: Cadastro de Chaves Pix E-mail
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
    Then Seleciona a Opção CADASTRAR CHAVE

  Scenario: Cadastro de Chaves Pix Aleatória
    Given Que o Usuario está na Home do App
    When seleciona a Opção Minhas Chaves
    And É exibido a tela de Gerenciamento de Chaves
    And Seleciona o Botão CADASTRAR CHAVE
    And Seleciona a opção de Chave E-Mail
    And Seleciona o Botão CONTINUAR
    And Informa o endereço de E-Mail que deseja cadastrar
    And Seleciona o CheckBox de Acordo com os termos
    And Seleciona o Botão CONFIRMAR
    Then Seleciona a Opção CADASTRAR CHAVE