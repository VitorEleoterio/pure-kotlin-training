fun main() {

    fun testePalindromo(palavra: String) {
        val limpa = palavra.replace(" ","").lowercase()
        var invertida = ""

        for (i in limpa.length - 1 downTo 0){
            invertida += limpa[i]
        }
    }
}