Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o] 
// Professor(a): Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2016
Var
// Se��o de Declara��es das vari�veis 
codProd, codPais: inteiro
pesoKg, pesoG, precoG, imposto, precoTotal: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
 escreva("Digite o c�digo do produto (1 a 10): ")
 leia(codProd)
 escreva("Digite o peso do produto em quilos: ")
 leia(pesoKg)
 escreva("Digite o c�digo do pa�s (1 a 3): ")
 leia(codPais)
 
 pesoG <- pesoKg*1000
 
 se (codProd > 0) e (codProd <= 4) entao
   precoG <- 15*pesoG
   senao
     se (codProd >= 5) e (codProd <= 7) entao
       precoG <- 25*pesoG
     senao
       precoG <- 35*pesoG
     fimse
 fimse
 
 escolha codPais
   caso 1
     imposto <- 0
   caso 2
     imposto <- 0.15*precoG
   caso 3
     imposto <- 0.25*precoG
 fimescolha
 
 precoTotal <- precoG + imposto
 
 escreval ("O peso em gramas �: ", pesoG)
 escreval ("O pre�o total do produto �: ", precoG)
 escreval ("O valor do imposto �: ", imposto)
 escreval ("O valor do produto com o imposto �: ", precoTotal)
 
 


Fimalgoritmo