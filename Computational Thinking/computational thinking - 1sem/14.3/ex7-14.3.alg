algoritmo "semnome"
// Disciplina: [Linguagem e L�gica de Programa��o] 
// Professor(a): Antonio Carlos Nicolodi 
// Fun��o :
// Autor :
// Data : 14/03/2016
// Se��o de Declara��es 
var
nome :caractere
dias :inteiro
conta: real
inicio
// Se��o de Comandos 
escreva("Digite o seu nome: ")
leia(nome)
escreva("Digite a quantidade de dias: ")
leia(dias)
se dias < 15 entao
   conta <- 80*dias + 8*dias
senao
  se dias = 15 entao
    conta <- 80*15 + 6*15
senao
conta = 80*dias +5.5*dias
fimse
fimse
escreval("Nome: ", nome)
escreval("Total: ", conta)
fimalgoritmo
