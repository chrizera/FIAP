Algoritmo "semnome"
// Disciplina  : [Linguagem e L�gica de Programa��o]
// Professor(a): Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/02/2016
Var
   // Se��o de Declara��es das vari�veis
   ps1,ps2,am1,am2,nac1,nac2:real
   media1S,media2S,mediaAnual:real

Inicio

   //ENTRADAS
   escreva("Digite a PS1:")
   leia(ps1)
   escreva("Digte a AM1:")
   leia(am1)
   escreva("Digite a NAC1:")
   leia(nac1)

   escreva("Digite a PS2:")
   leia(ps2)
   escreva("Digite a AM2:")
   leia(am2)
   escreva("Digite a NAC2:")
   leia(nac2)

   //PROCESSAMENTO
   media1S<-ps1*0.5+am1*0.3+nac1*0.2
   media2S<-ps2*0.5+am2*0.3+nac2*0.2
   mediaAnual<-(media1S+media2S)/2

   //SA�DAS
   escreval("M�dia 1� Semestre:",media1S)
   escreval("M�dia 2� Semestre:",media2S)
   escreval("M�dia Anual:",mediaAnual)

   se mediaAnual >= 6 entao
      escreval("Foi aprovado")
   senao
      escreval("Exame")
   fimse

























Fimalgoritmo
