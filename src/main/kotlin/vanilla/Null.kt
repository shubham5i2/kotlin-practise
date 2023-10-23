package vanilla

fun main() {
    //we need to add ? inorder to tell compiler that we can have value as null
    var firstName: String? = "Shubham"
    if (firstName != null) println(firstName.length)
    else println(null)

    firstName = null
    //alternative of if-else is ?.(safe call operator)
    println(firstName?.length)

    /*Elvis operator(?:) : When you have a nullable reference say lastName, if lastName is not null, use it,
    otherwise return right-hand side expression*/
    val lastName: String? = null
    val result = lastName?.length ?: "Value is null"
    println(result)

    //not-null assertion operator(!!) : converts any value to a non-nullable type and throws an exception if the value is null
    val city: String? = null
    val len = city!!.length
    println(len)
}