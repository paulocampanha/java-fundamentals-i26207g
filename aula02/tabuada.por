programa {
  funcao inicio() {
    inteiro numero, contador, total
    escreva("==================================\n")
    escreva("Digite um número para a tabuada: ")
    leia(numero)
    contador = 1
    escreva("===================================\n")
    escreva(" *** Tabuada do ",numero, " ***\n")
    escreva("===================================\n")
    enquanto (contador <= 10){
      total = numero * contador
      escreva(numero, " X ",contador, " = ", total,"\n")
      contador = contador + 1
    }
    escreva("===================================\n")
  }
}
