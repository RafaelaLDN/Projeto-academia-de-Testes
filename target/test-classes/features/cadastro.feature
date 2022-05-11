
@Cadastro
Feature: Cadastro em E-comerce
   
  @Cadastro1
  Scenario Outline: Validar cadastro valido
    Given usuario abriu o site "http://automationpractice.com/index.php"
    When usuario clicou no botao Singnin
    And preencher o "<e_mail>"
    And usuario clicou no botao Submit Create
    Then o sistena apresentara pagina de cadastro

    Examples: 
      |e_mail          |
      |rafa16@gmail.com |
      
  @Validarcadastro
  Scenario Outline: Validar conclusao de cadastro
    Given usuario esteja logado
    When usuario preencher todos os campos obrigatorios
    And clicar no botao Submit Account
    Then o sistena apresentara pagina de compra 
  
    
    

    