fun main() {
    val x = 50
    val y = 10
    var result = x + y
    println("x+y = $result")
    println("x+y = ${x + y}")
    println("x-y = ${x - y}")
    println("x*y = ${x * y}")
    println("x/y = ${x / y}")
    println("x%y = ${x % y}")

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    var a = 0
    println("a++ = ${a++}")
    println("++a = ${++a}")
    println("a-- = ${a--}")
    println("--a = ${--a}")
}