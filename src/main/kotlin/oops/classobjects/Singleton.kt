package oops.classobjects

fun main() {
    val instance = Database.getInstance()
    val instance1 = Database.getInstance()
    println(instance) //o/p: oops.classobjects.Database@682a0b20
    println(instance1) //o/p: oops.classobjects.Database@682a0b20
    //compile time error: Cannot access '<init>': it is private in 'Database'
    //Database()
    println(Authorization) //o/p: oops.classobjects.Authorization@214c265e
    println(Authorization) //o/p: oops.classobjects.Authorization@214c265e
    println(Authorization) //o/p: oops.classobjects.Authorization@214c265e
}

//Database class cannot be instantiated because of private constructor
class Database private constructor() {
    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }
            return instance
        }
    }
}

//singleton can also be achieved through 'object' keyword
object Authorization {
    init {
        println("Authorization created")
    }
}