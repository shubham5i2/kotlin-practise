package oops.classobjects

fun main() {
    val user = LateInit("Shubham")
    user.favouriteMovie = "Interstellar"
    println("My name is ${user.name}. I love watching ${user.favouriteMovie} movie")

}

class LateInit(var name: String) {
    /*lateinit keyword is used on the field which has to be initialized later.
    It cannot be applied to Primitive datatype.
    If it is not initialized later, then it throws UninitializedPropertyAccessException*/
    lateinit var favouriteMovie: String
}