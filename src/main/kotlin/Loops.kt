fun main() {
    //print n numbers using '..'
    for (i in 1..10) {
        print("$i ")
    }
    println() //for new line

    //print n-1 numbers using 'until'
    for (i in 1 until 5) {
        print("$i ")
    }
    println() //for new line

    //print number in backward direction using 'downTo'
    for (i in 6 downTo 1) {
        print("$i ")
    }
    println() //for new line

    //skip arbitrary step, here number is skipped after every 2nd iteration
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println() //for new line
}