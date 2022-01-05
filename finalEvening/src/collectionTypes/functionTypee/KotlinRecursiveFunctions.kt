package collectionTypes.functionTypee

/**
 * Today we will discuss about Kotlin recursive functions.
 * A function in Kotlin which calls itself continuously is known as recursive function.
 * This concept is not native to Kotlin but is present in all other the languages.
 * Recursive function can be considered as a loop but both are not completely same.
The recursive function must have a breaking condition to stop the recursion;
else it will run forever. Mostly the breaking condition is based on a parameter
passed to the function
 * **/

fun main(){
    println("Factorial of 5 is: ${factorial(5)}")
    println("Factorial using recursive function of 5 is: ${factorialUsingRecursive(5)}")
}

fun sayBye(){
    sayBye()
}

/**
 * Let us write a program to find factorial of a number.
 * We will first write it using for loop and then later using recursive function.
 * **/

fun factorial(n: Int): Int{
    var factorialOfN = 1
    for(i in n downTo 1){
        factorialOfN *= i
    }
    return factorialOfN
}

//Now let's implement this using Recursive function:

fun factorialUsingRecursive(n: Int): Int{
    if(n == 1)
        return 1
    return n * factorial(n - 1)
}

