Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o] 
// Professor(a): Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
// Se��o de Declara��es das vari�veis 
salario, bonus1: real
tempo1: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Digite o seu sal�rio: ")
leia(salario)
escreva("Digite o seu tempo na empresa: ")
leia(tempo1)

se tempo1 >= 5 entao
   bonus1 <- 0.2*salario
senao
   bonus1 <- 0.1*salario
fimse

escreva("O bonus �: ", bonus1)

Fimalgoritmo