Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o]
// Professor(a): Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
   // Se��o de Declara��es das vari�veis
   media: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("Digite o valor da sua m�dia: ")
   leia(media)

   se media < 6 entao
      escreva("Insuficiente")
   senao
      se media < 8 entao
         escreva("Regular")
      senao
         se media < 9 entao
            escreva("Bom")
         senao
            escreva("�timo")
         fimse
      fimse
   fimse
Fimalgoritmo