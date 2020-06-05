class Human (val name:String="human",val height:Int =6){
    var country:String ="India"
    fun print(){
        println("""
            name :${name.toUpperCase()}
            height :$height
            country :$country
        """.trimIndent())
    }

}