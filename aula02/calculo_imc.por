programa {
  funcao inicio() {
    real peso, altura, imc
    cadeia nome
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite seu peso em quilos: ")
    leia(peso)
    escreva("Digite sua altura: ")
    leia(altura)
    imc = peso / (altura * altura)
    escreva("========================================")
    escreva("\n ***** Índice de Massa Corporal ***** ")
    escreva("\n Nome: ", nome)
    escreva("\n IMC: ", imc)
    escreva("\n======================================")

  }
}
