algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 04/04/2016
// Se��o de Declara��es 
var
nome: caractere
preco, sub, total: real
quant, i: inteiro
inicio
// Se��o de Comandos 
para i de 1 ate 2 faca
  escreval("Produto: ")
  leia(nome)
  escreval("Pre�o: ")
  leia(preco)
  escreval("Quantidade: ")
  leia(quant)
  sub <- preco*quant
  escreval("Subtotal: ", sub)
  total <- total + sub
fimpara
se total > 100 entao
  total <- total*(0.9)
  escreval("Total com desconto: ", total)
senao
  escreval ("Total: ", total)
fimse
fimalgoritmo
