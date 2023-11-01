package oops.dataclass

//Data classes in Kotlin are classes whose main purpose is to hold data
fun main() {
    val user1 = User("Andrew", "Amsterdam")
    val user2 = User("Derek", "London")
    val user3 = User("Andrew", "Amsterdam")

    println("user1===user2 -> ${user1 === user2}")
    println("user1.equals(user2) -> ${user1.equals(user2)}")
    println("user1 === user3 -> ${user1 === user3}")
    println("user1.equals(user3) -> ${user1.equals(user3)}")
    println("user1.toString() -> ${user1.toString()}")
    println("user2 -> $user2")

    val shape1 = Shape("Square")
    val shape2 = Shape("Square")
    val shape3 = Shape("Circle")

    println("shape1.equals(shape2) -> ${shape1.equals(shape2)}")
    println("shape3 -> $shape3")
}

//without data keyword we need to override 'Any' class functions to implement the logic
class User(var name: String, var city: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other is User) {
            return this.name == other.name
                    && this.city == other.city
        }
        return false
    }

    //we need to override hashCode() as well when we override equals()
    override fun hashCode(): Int {
        //no-logic
        return 0
    }

    override fun toString(): String {
        return "User(firstName='$name', city='$city')"
    }
}

//with data keyword we don't need to write the above logic
data class Shape(var name: String)