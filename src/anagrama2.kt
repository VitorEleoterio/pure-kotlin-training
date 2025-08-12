fun main() {

    fun anagrama(p1 : String, p2 : String){
        val limpo1 = p1.replace(" ","").lowercase()
        val limpo2 = p2.replace(" ","").lowercase()

        if (p1 != p2){
            println("Não é anagrama")
            return
        }

        val map1 = mutableMapOf<Char, Int>()
        val map2 = mutableMapOf<Char, Int>()

        for (c in limpo1){

        }
    }
}