Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o]
// Professor(a): Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
   // Se��o de Declara��es das vari�veis
   codigo: inteiro
   preco: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("Digite o codigo: ")
   leia(codigo)
   escreva("Digite o preco: ")
   leia(preco)

   escolha codigo
   caso 1
      escreva("Porc SUL")
   caso 2
      escreva("Proc NORTE")
   caso 5, 6, 25 ate 30
      escreva("Proc NORDESTE")
   caso 10 ate 20
      escreva("Proc CENTRO-OESTE")
   outrocaso
      escreva("produto IMPORTADO")
   fimescolha

Fimalgoritmo