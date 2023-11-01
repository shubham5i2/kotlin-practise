package oops.abstract

fun main() {
    val car = Car("BWM", 5000)
    car.cost()
}

abstract class Vehicle {
    abstract fun cost()
}

class Car(private var name: String, private var cost: Int) : Vehicle() {
    override fun cost() {
        println("$name costs $$cost")
    }
}