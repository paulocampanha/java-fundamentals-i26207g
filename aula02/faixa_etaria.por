programa {
  funcao inicio() {
    cadeia nome
    inteiro anoNascimento, anoAtual, idade
    caracter resposta
    anoAtual = 2026
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite o ano do seu nascimento: ")
    leia(anoNascimento)
    idade = anoAtual - anoNascimento
    escreva("Já fez aniversário esse ano (s/n)? ")
    leia(resposta)
    se (resposta == "n") {
      idade = idade - 1
    }
    se (idade >= 65) {
      escreva(nome,", você é um idoso.")
    } senao se (idade >= 18) {
      escreva(nome, ", você é adulto.")
    } senao se (idade >= 12) {
      escreva(nome,", você é um adolescente.")
    } senao se (idade >= 0) {
      escreva(nome,", você é uma criança.")
    } senao {
      escreva(nome,", você informou uma ano inválido.")
      escreva("\nSua idade deu um número negativo.")
    }
    escreva("\nSua idade é ", idade)
  }
}
