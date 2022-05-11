@Compra
Feature: Compra em E-comerce
  

  @Login
  Scenario Outline: Valida login
    Given usuario abrir o site "http://automationpractice.com/index.php"
    When usuario clicar no botao Singnin
    And preencher o "<e_mail>", "<senha>"
    And clicar no botao Submit login
    Then o sistena apresentara pagina de compras
    
    Examples: 
      |e_mail           |senha | 
      |rafa125@gmail.com|123456| 
      
  @Compra
  Scenario Outline: Validar compras  finalizar
    Given usuario esteja logado
    When usuario escolher pecas 
    And  usuario seguir no processo de finalizacao de compra "<txtmsg>"
    Then o sistema devera exibir a compra finalizada
    And retornar para a pagina inicial
       
        
    Examples: 
      |txtmsg                        |
      |Entregar em horario comercial!|
    
  
    
  
  
    
    