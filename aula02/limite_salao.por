programa {
  funcao inicio() {
    cadeia nome
    inteiro numeroConvidados
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite o número de convidados: ")
    leia(numeroConvidados)
    se(numeroConvidados > 100) {
      escreva("O limite de convidados para o salão é de 100 pessoas")
      escreva("\nVocê informou ", numeroConvidados, " pessoas")
      escreva("\nNão podemos atendê-lo.")
    } senao {
      escreva("O número de convidados atende o limíte do salão.")
      escreva("\n",nome,", preencha o formulário de cadastro.")
    }
    escreva("\n=========================================")
    escreva("\n ***** Salão de Festa KYX Produções ***** ")
  }
}
