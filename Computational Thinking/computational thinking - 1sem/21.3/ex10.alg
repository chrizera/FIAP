algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 21/03/2016
// Se��o de Declara��es 
var
opcao :inteiro
salario, imposto, novoSalario: real
inicio
// Se��o de Comandos 
escreval ("Escolha uma op��o do menu: ")
escreval ("1- Imposto")
escreval ("2- Novo sal�rio")
escreval ("3- Classifica��o")
escreval ("4- Sair")
leia (opcao)
escolha opcao
      caso 1
           escreva ("Digite o seu sal�rio: ")
           leia (salario)
           se salario < 1000 entao
              imposto <- 0.07*salario
           senao
              se (salario >= 1000) e (salario <= 1850) entao
                 imposto <- 0.12*salario
           senao
              imposto <- 0.15*salario
              fimse
           fimse
           escreval ("Seu imposto �: ", imposto)
      caso 2
           escreva ("Digite o seu sal�rio: ")
           leia (salario)
           se salario < 900 entao
              novoSalario <- 1.05*salario
           senao
              se (salario >= 900) e (salario <= 1600) entao
                 novoSalario <- 1.07*salario
           senao
              se (salario > 1600) e (salario <= 2000) entao
                 novoSalario <- 1.09*salario
           senao
              novoSalario <- 1.12*salario
              fimse
              fimse
           fimse
           escreval("O seu novo sal�rio �: ", novoSalario)
      caso 3
           escreva ("Digite o seu sal�rio: ")
           leia (salario)
           se salario <= 1550 entao
              escreval ("Mal remunerado!")
           senao
              escreval ("Bem remunerado!")
           fimse
 fimescolha
fimalgoritmo
