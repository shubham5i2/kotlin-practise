package oops.classobjects

fun main() {
    val sum = Calculator.sum(5, 7)
    println("Sum = $sum")
}

class Calculator {
    //companion object is like 'static' in Java
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}