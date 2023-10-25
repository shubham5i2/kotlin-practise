package oops.inheritance

fun main() {
    val car = Car("BMW", "Black", 150)
    car.move()
    car.stop()
}

//parent class
open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$color color $name is moving")
    }

    open fun stop() {
        println("$color color $name has stopped")
    }
}

//child class
class Car(name: String, color: String, private var speed: Int) : Vehicle(name, color) {
    override fun move() {
        println("$color color $name is moving with speed $speed kmph")
    }

    override fun stop() {
        println("In Car: stop()")
        super.stop()
    }
}
