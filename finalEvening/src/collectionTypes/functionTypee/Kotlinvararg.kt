package collectionTypes.functionTypee

/**
 * The vararg stands for variable number of arguments.
 * Kotlin allows us to pass variable number of arguments to a function using vararg.
 * **/

//Let us create a function which can take variable number as arguments and returns their sum

fun main() {
    findSum(1,2,10,6,5)
    findSum(1)
}
// function taking variable number of arguments
fun findSum(vararg numbers: Int): Int {
    var sum = 0
    // loop around the arguments
    for (number in numbers)
        sum += number
    return sum
}