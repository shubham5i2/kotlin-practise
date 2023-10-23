package vanilla

fun main() {
    val number = 18

    //when statement is replacement of switch in Kotlin
    when (number) {
        12 -> println("Number is $number")
        7 -> println("Number is $number")
        10 -> println("Number is $number")
        else -> println("Number is $number")
    }

    when (number) {
        7, 10 -> println("My lucky number is $number")
        else -> println("Nothing")
    }

    val text = when {
        number % 2 == 0 -> "$number is even"
        else -> "$number is odd"
    }
    println(text)

    when (number) {
        in 1..10 -> println("Input is provided in the range 1 to 10")
        in 11..20 -> println("Input is provided in the range 11 to 20")
        else -> println("Number greater than 20")
    }
}