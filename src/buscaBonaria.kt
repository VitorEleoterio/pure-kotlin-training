fun buscaBinaria(lista: IntArray, alvo: Int): Int {
    var inicio = 0
    var fim = lista.size - 1

    while (inicio <= fim) {
        val meio = inicio + (fim - inicio) / 2
        println("Testando posição $meio (valor: ${lista[meio]})")

        when {
            lista[meio] == alvo -> return meio
            lista[meio] <  alvo -> inicio = meio + 1
            else -> fim = meio - 1
        }
    }

    return -1 // não encontrou
}

fun main() {
    val lista = IntArray(1000) { i -> i + 1 }
    val alvo = 700

    val posicao = buscaBinaria(lista, alvo)

    if (posicao >= 0) {
        println("Encontrado: valor $alvo no índice $posicao (posição humana: ${posicao + 1})")
    } else {
        println("Não encontrado: $alvo")
    }
}