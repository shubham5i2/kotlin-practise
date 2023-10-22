fun main() {
    val names: Array<String> = arrayOf("Shubham", "Lalitha", "Ram")
    val mixedTypeArray = arrayOf("Alex", "Mandeep", 12, 'S', true)
    println(checkName(names))

    for (name in names) {
        print("$name ")
    }
    println() //new line
    println(names.joinToString()) //iterate an array using 'joinToString()'

    for (mixedType in mixedTypeArray) {
        print("$mixedType ")
    }
    println() //new line

    //print only specific type of values using 'is'
    for (mixedType in mixedTypeArray) {
        if (mixedType is String) {
            print("$mixedType ")
        }
    }
    println() //new line

    // Creates an array with values [1, 2, 3]
    val simpleArray = arrayOf(1, 2, 3)
    println(simpleArray.joinToString())

    // Creates an array with values [null, null, null]
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

    // Creates a two-dimensional array
    val twoDArray = Array(2) { Array<Int>(3) { 0 } }
    println(twoDArray.contentDeepToString())

    // Compares contents of arrays
    val firstArray = arrayOf(1, 2, 3)
    val secondArray = arrayOf(1, 2, 3)
    println(firstArray.contentEquals(secondArray))

    //convert arrays to collections
    val veggiesArray = arrayOf("Spinach", "Bitterguard", "Spinach", "Capsicum")
    println("Simple array to List: ${veggiesArray.toList()}")
    println("Simple array to Set: ${veggiesArray.toSet()}")

    //convert to Map. Only an array of Pair<K,V> can be converted to a map
    val appleElement = "Apple" to (100)
    val fruitsArray = arrayOf(appleElement, "Banana" to (200), "Mango" to (300))
    val toMap = fruitsArray.toMap()
    println("Simple array to Map: $toMap")

    //Pair
    val (i, s) = Pair(1, "Hello")
    println(i) //1
    println(s) //Hello
    val pair = Pair(2, "World!")
    println(pair.toList()) //[2, World!]
    println(pair.first) //2
    println(pair.second) //World!

    //Primitive type arrays
    val primitiveArray = arrayOf(11, 22, 33) //type: Array<Int>
    val toIntArray = primitiveArray.toIntArray() //type: IntArray(equivalent to int[] in java)
    val toTypedArray = toIntArray.toTypedArray() //converted back to type: Array<Int>
    println(toIntArray.joinToString())
    println(toTypedArray.joinToString())
}

//when
fun checkName(names: Array<String>): String {
    return when {
        "John" in names -> "John exists in an array"
        "Shubham" in names -> "Shubham exists in an array"
        else -> "Name doesn't exists"
    }
//    return result
}