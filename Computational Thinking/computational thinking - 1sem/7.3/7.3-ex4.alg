Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o]
// Professor(a): Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
   // Se��o de Declara��es das vari�veis
   dia1, dia2, mes1, mes2, ano1, ano2, soma1, soma2: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("Digite a primeira data: ")
   leia(dia1, mes1, ano1)
   escreva("Digite a segunda data: ")
   leia(dia2, mes2, ano2)

   soma1 <- dia1+ 30*mes1 + 365*ano1
   soma2 <- dia2+ 30*mes2 + 365*ano2

   se soma1 = soma2 entao
      escreval ("datas iguais")
   senao
      se soma1 > soma2 entao
         escreval("A data mais recente �: ")
         escreval("Dia ", dia1)
         escreval("M�s ", mes1)
         escreval("Ano ", ano1)
      senao
         escreval("A data mais recente �: ")
         escreval("Dia ", dia2)
         escreval("M�s ", mes2)
         escreval("Ano ", ano2)
      fimse
   fimse

Fimalgoritmo