fun main() {
    val names: Array<String> = arrayOf("Shubham", "Lalitha", "Ram")
    val mixedTypeArray = arrayOf("Alex", "Mandeep", 12, 'S', true)

    for (name in names) {
        print("$name ")
    }
    println() //new line

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
}