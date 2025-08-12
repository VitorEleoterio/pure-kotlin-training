fun main() {

    fun palindromo(palavra : String){
       var invertido = ""
       val limpa = palavra.replace(" ","").lowercase()

        for (i in limpa.length - 1 downTo 0){
            invertido += limpa[i]
        }

        if (limpa == invertido){
            println("A palavra \"$palavra\" é um palindromo")
        }else{
            println("A palavra \"$palavra\" não é um palindromo")
        }

    }

    palindromo("arara")
    palindromo("Ovo")
    palindromo("Vitor")
}