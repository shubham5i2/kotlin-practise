fun main() {
    //try used as expression
    val text = try {
        val div = 10 / 2
        div
    } catch (e: ArithmeticException) {
        null
    }
    val value = text?.times(2) ?: "try expression returned null"
    println(value)

    //nothing type
    val name = "Shubham"
//    val name: String? = null
    val nothingType = name?.length ?: nothingType(name)
    println(nothingType)
    val x = null //type: Nothing
    val list = listOf(x) //list is of type Nothing
}

fun nothingType(name: String?): Nothing {
    throw IllegalArgumentException("Name is required")
}