Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o] 
// Professor(a): Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/03/2016
Var
// Se��o de Declara��es das vari�veis 
   idade :real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
      escreva("Digite a sua idade: ")
      leia(idade)

      escolha idade
             caso 3 ate 4
                  escreval("Mirim")
             caso 5 ate 7
                  escreval("Infantil A")
             caso 8 ate 10
                  escreval("Infantil B")
             caso 11 ate 13
                  escreval("Juvenil A")
             caso 14 ate 17
                  escreval("Juvenil B")
             caso 18 ate 50
                  escreval("Adulto")
             caso 51 ate 100
                  escreval("Veterano")
             outrocaso
                  escreval("Idade n�o permitida")
      fimescolha



Fimalgoritmo