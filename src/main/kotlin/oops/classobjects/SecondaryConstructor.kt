package oops.classobjects

fun main() {
    val myself = User("John")
    val friend = User("Doe", 23)
    //Named Arguments
    val course = Course(name = "Android Development", duration = 2)
    val course1 = Course(name = "Full Stack Development")

    println("My name is ${myself.name} and my best friend name is ${friend.name}")
    println("${myself.name} is interested in ${course.name} which is of duration ${course.duration} months")
    println("${friend.name} is interested in ${course1.name} which is of duration ${course1.duration} months")
}

class User(var name: String, var city: String, var age: Int) {

    //secondary constructors
    constructor(name: String) : this(name, "Visakhapatnam", 25)

    constructor(name: String, age: Int) : this(name, "Visakhapatnam", age) {
        println("This is secondary constructor")
    }
}

class Course(var name: String, var duration: Int = 2) {
    constructor(name: String) : this(name, 3)
}

class Data(a: String, b: Int) {
    var a = a
        //getter and setter
        get() {
            return field
        }
        set(value) {
            field = value
        }
}