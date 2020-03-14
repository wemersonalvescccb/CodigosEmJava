#language: pt
#encoding: UTF-8
Funcionalidade: Admin
      
@CadastrarUruario
Cenario: Cadastrar usuario
Dado que eu realizei login
E que eu acesse o menu Admin
E clicar no botao add
Quando eu preencher o campo Employer name "Fiona Grace"
E preencher o campo user name "Rogerio"
E preencher o campo password "12345678"
E preencher o campo confirm password "12345678"
E clicar no botao salvar
Entao o sistema apresenta o usuario cadastro "Rogerio"