Feature: Cadastro de Chaves CPF Cenario de erros

  Scenario: Validar o cadastro de um CPF já Cadastrado
    Given Que o Usuario está na Home do App
    When seleciona a Opção Minhas Chaves
    And É exibido a tela de Gerenciamento de Chaves
    And Seleciona o Botão CADASTRAR CHAVE
    And Seleciona a opção de Chave CPF
    And Seleciona o Botão CONTINUAR
    And Informa o CPF já cadastrado
    Then apresenta a mensagem CPF Ja Cadastrado

  Scenario: Validar o cadastro de um e-mail já Cadastrado
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
    And Seleciona a Opção CADASTRAR CHAVE
    Then apresenta a mensagem E-mail Ja Cadastrado

  Scenario: Validar o cadastro de um Celular já Cadastrado
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
    Then apresenta a mensagem Celular Ja Cadastrado





