fun main() {

    fun anagrama(p1 : String, p2 : String){
        val limpa1 = p1.replace(" ","").lowercase()
        val limpa2 = p2.replace(" ","").lowercase()

        if (limpa1.length != limpa2.length){
            println("Não é ANAGRAMA")
            return
        }

        val map1 = mutableMapOf<Char, Int>()
        val map2 = mutableMapOf<Char, Int>()

        for (c in limpa1){
            map1[c] = map1.getOrDefault(c, 0) + 1
        }

        for (c in limpa2){
            map2[c] = map2.getOrDefault(c, 0) + 1
        }

        if (map1 == map2){
            println("É anagrama")
        }else{
        }


    }

    anagrama("banana","nanabao")
}