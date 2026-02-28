programa {
  funcao inicio() {
    real nota1, nota2, nota3, media
    cadeia nome
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite a primeira nota: ")
    leia(nota1)
    escreva("Digite a segunda nota: ")
    leia(nota2)
    escreva("Digite a terceira nota: ")
    leia(nota3)
    media = (nota1 + nota2 + nota3) / 3
    escreva(nome,", sua média foi ", media)
    
  }
}
