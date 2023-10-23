package vanilla

fun main() {
    sayHello("Shubham")
    val max = getMax(10, 20)
    println("Max value is $max")
    val add = add(7, 9)
    println("Addition of 2 number is $add")
    val maxOfThree = maxOfThree(23, 12, 87)
    println("Max of 3 number $maxOfThree")
    //default parameters
    sendMessage()
    //named parameters
    sendMessage(gender = "Female", name = "Lalitha")
    //parameter as function
    sendMessage(name = "Alex")
    println("Sum of numbers using vararg = ${sum(2, 5, 1, 7, 4, 9)}")
}

fun sayHello(name: String) {
    println("Hello, $name!")
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max;
}

//function as expression
fun add(a: Int, b: Int): Int = a + b

//kotlin recommended return statement
fun maxOfThree(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

fun sendMessage(name: String = "Shubham", gender: String = getGender()) {
    println("Name = $name, Gender = $gender")
}

fun getGender() = "Male"

//vararg can accept any number of arguments in a function
fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}