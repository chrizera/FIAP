algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 04/04/2016
// Se��o de Declara��es 
var
idade, i, contIdade, contM: inteiro
sexo: caractere
idadeMedia: real
inicio
// Se��o de Comandos 
para i de 1 ate 10 faca
   escreval("Digite a idade: ")
   leia(idade)
   escreval("Digite o sexo: ")
   leia(sexo)
   idadeMedia <- idadeMedia + idade
   se idade >= 18 entao
     contIdade <- contIdade + 1
   fimse
   se sexo = "M" entao
     contM <- contM + 1
   fimse
fimpara
idadeMedia <- idadeMedia/10
escreval("Turma lotada.")
escreval("Idade m�dia: ", idadeMedia)
escreval("Quantidade maiores de idade: ", contIdade)
escreval("Quantidade de homens: ", contM)
fimalgoritmo
