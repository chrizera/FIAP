Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o] 
// Professor(a): Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/03/2016
Var
// Se��o de Declara��es das vari�veis 
   peso, altura, imc :real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
     escreva("Digite o seu peso: ")
     leia(peso)
     escreva("Digite a sua altura: ")
     leia(altura)
     imc <- peso/(altura*altura)
     escolha imc
           caso 0 ate 18.5
                escreval("Baixo peso")
           caso 18.6 ate 24.9
                escreval("Peso normal")
           caso 25.0 ate 29.9
                escreval("Pr� obesidade")
           caso 30.0 ate 34.9
                escreval("Obesidade grau I")
           caso 35.0 ate 39.9
                escreval ("Obesidade grau II")
           outrocaso
                escreval ("Obesidade grau III")
     fimescolha
Fimalgoritmo
