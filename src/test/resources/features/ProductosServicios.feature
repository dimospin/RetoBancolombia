#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Productos y Servicios Bancolombia
El usuario debe poder ingresar a la pagina de Productos y Servicios Bancolombia a la opcion de Tarjetas de Crédito,  
llevando a un archivo .xls la información completa de la tarjeta de crédito American Express y MasterCard Black.  
Luego el usuario solicita el producto tarjeta American Express, llenando los campos del formulario obligatorios, tomados desde
un archivo .xls de forma automática. 

  @CasoExitoso
 Scenario: Diligenciamiento de formulario Solicitud Tarjeta American Express
    Given Que me encuentro en el sitio web de Productos y Servicios Bancolombia
    And Capturo información de TC
    When Diligencio el formulario de Datos Basicos de Solicitud Tarjeta Credito  
    Then Verifico diligenciamiento exitoso del formulario
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
