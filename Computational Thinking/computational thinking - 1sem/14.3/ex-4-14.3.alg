Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o] 
// Professor(a): Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/03/2016
Var
// Se��o de Declara��es das vari�veis 
   valor, valorf :real
   invest :caracter

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
     escreval("TIPO DE INVESTIMENTO")
     escreval("Poupan�a (c�digo A)")
     escreval("Fundo de renda fixa (c�digo B)")
     escreval("CDB (c�digo C)")
     escreval("A��es (c�digo D)")
     escreva("Digite o valor do seu investimento: ")
     leia(valor)
     escreva("Escolha o c�digo do tipo do seu investimento: ")
     leia(invest)
     escolha invest
            caso "A"
                 valorf <- valor*1.03
            caso "B"
                 valorf <- valor*1.05
            caso "C"
                 valorf <- valor*1.06
            caso "D"
                 valorf <- valor*1.1
            outrocaso
                 escreval("C�digo inv�lido.")
     fimescolha
     escreval("Valor do seu investimento: ", valorf)
Fimalgoritmo