algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 14/03/2016
// Se��o de Declara��es 
var
cod :inteiro
valor, valorf :real
inicio
// Se��o de Comandos 
escreva("Digite o c�digo: ")
leia(cod)
escreva("Digite o valor do produto: ")
leia(valor)
escolha cod
        caso 1
             valorf <- valor*0.9
        caso 2
             valorf <- valor*0.95
        caso 3
             valorf <- valor
        caso 4
             valorf <- valor*1.1
        outrocaso
             escreval("C�digo inv�lido")
fimescolha
escreva("valor: ", valorf)
fimalgoritmo
