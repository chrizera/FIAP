Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o] 
// Professor(a): Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
// Se��o de Declara��es das vari�veis 
salario, novosal: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
   escreva("Digite seu sal�rio: ")
   leia(salario)
   
   se salario < 500 entao
      novosal <- salario*1.15
   senao
      se (salario >= 500) E (salario <= 1000) entao
         novosal <- salario*1.1
      senao
         novosal <- salario*1.05
      fimse
   fimse
   
   escreva("NOvo salario �: ", novosal)

Fimalgoritmo