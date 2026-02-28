programa {
  funcao inicio() {
    inteiro valor1, valor2, soma, sub, 
    mult, div, resto

    escreva("Digite o primeiro número: ")
    leia(valor1)
    escreva("Digite o segundo número: ")
    leia(valor2)
    soma = valor1 + valor2
    sub = valor1 - valor2
    mult = valor1 * valor2
    div = valor1 / valor2
    resto = valor1 % valor2
    escreva("A soma dos valores é ", soma)
    escreva("\nA subtração dos valores é ", sub)
    escreva("\nA multiplicação dos números é ", mult)
    escreva("\nA divisão do primeiro número pelo segundo número é ", div)
    escreva("\nO resto da divisão do primeiro número pelo segundo número é ", resto )
  }
}
