#Author: Carolina Muñoz
# encoding: utf-8

Feature: conocer definicon de palabra
  yo como usuario de Wikipedia
  quiero buscar una palabra
  para conocer defincion

  Scenario: buscar palabra
    Given usuario ingresa a la pagina de Wikipedia
    When usuario busca la palabra
    Then usuario visualiza la defincion
    
 