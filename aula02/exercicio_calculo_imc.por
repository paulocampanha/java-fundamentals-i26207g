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
    
    se (imc <= 18.5) {
      escreva("\nSua classificação é de MAGREZA")
    } senao se (imc <= 24.9) {
      escreva("\nSua classificação é de Normal")
    } senao se (imc <= 29.9) {
      escreva("\nSua classificação é de Sobrepeso")
    } senao se (imc <= 34.9) {
      escreva("\nSua classificação é de Obesidade Grau 1")
    } senao se (imc <= 39.9) {
      escreva("\nSua classificação é de Obesidade Grau 2")
    } senao {
      escreva("\nSua classificação é de Obesidade Grau 3")
    }


    escreva("\n======================================")

  }
}
