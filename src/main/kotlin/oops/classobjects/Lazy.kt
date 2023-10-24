package oops.classobjects

fun main() {
    Lazy("Shubham")

    //object is created only when its invoked
    val user by lazy {
        Lazy("Ram")
    }
    println(user.name)
}

class Lazy(var name: String) {
    init {
        println("User $name is created")
    }
}