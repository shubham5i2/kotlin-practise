package oops.classobjects

fun main() {
    val car = Car()
    car.name = "Mercedes"
    car.model = "S-Class"
    car.color = "Black"

    println("Name = ${car.name}")
    println("Model = ${car.model}")
    println("Color = ${car.color}")

    car.move()
    car.stop()

    val bike = Bike("Hero Honda", "Splendor Plus", "70kmph")
    bike.move()
}

//class with default constructor
class Car {
    var name = ""
    var model = ""
    var color = ""

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}

//class with parametrized constructor
// 'name' parameter is converted to a property
class Bike(private var name: String, model: String, speed: String) {
    var model = model
    var speed = speed

    //initializer block - initiated 1st the moment object is created
    init {
        println("Inside init block")
    }

    fun move() {
        println("$name - $model is moving with speed $speed")
    }
}