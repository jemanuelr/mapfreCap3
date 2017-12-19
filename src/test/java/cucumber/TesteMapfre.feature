@CadastroSimples
Feature: Incluir uma nova proposta
  
  Percorrer todo os processo para finalizar o status do cliente
  Cadastro
  Baixa de Pagamento e Número de Titulo e da Sorte

  @Cadastro
  Scenario: Cadastro de propsota para o Produto Tradicional Simples
    Given Que o login esta sendo efetuado e a pagina de cadastro esta aberta
    When O cadastro inicia-se informando o tipo do produto
    Then Informamos os dados do Subscritor
    And Os dados do titular
    And Os dados do angariador
    And Os dados do corretor
    And Os dados do locador
    And Os dados do locatario 
    And Os dados da imobiliaria 
    When Gravamos o cadastro e guardamos a evidencia
    Then Finalizamos o cadastro 
    
  #@Processo
  #@Pagamento
  #Scenario: Pagamento manual
    #Given que o gerenciador de processo foi rodado e estamos na pagina da baixa de Pagamento
