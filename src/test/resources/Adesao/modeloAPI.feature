Feature: teste

  Scenario: Teste

    Given que eu execute a Query com os registros dos consumidores da base do Logix
    And selecione um CPF
    And consulte esse CPF no Endpoint de Consumers
    When copio o ConsumerID da response
    And consulto o EndPoint balance para verificar a pontuação do consumidor
    And no acrescento creditos a ele no Endpoint Credit
    And no EndPoint consumerLevel eu verifique qual o Level o consumidor esta
    And no EndPoint rescueProducts verifico quais os produtos disponiveis para resgate
    And no EndPoint exchangeBenefits eu passe o ProductCode
    And no EndPoint statement eu identifique a operação de resgate de produtos
    Then ao consultar o EndPoint balance, deve ter debitado a quantidade de pontos do produto selecionado no resgate