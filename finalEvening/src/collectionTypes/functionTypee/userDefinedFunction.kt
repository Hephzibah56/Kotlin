package collectionTypes.functionTypee
/**
 * In this tutorial we will discuss about Kotlin functions,
both Kotlin library functions and user-defined functions.
Functions are used to break huge monolithic code into smaller pieces/chunks of code
which are reusable. Ideally, we should create a function for a single task.
Functions also increases code readability as once written,
the function can be called multiple times whenever required.

The functions can be of two types:

-Standard library functions

-User defined functions

Standard library functions are provided by Kotlin standard
library and can be used directly.
We have already used many standard library functions like:
print(), println(), main(), arrayOf() etc

You can explore more about Kotlin standard library here:
https://kotlinlang.org/api/latest/jvm/stdlib/
 * **/
//Kotlin User Defined Functions
/**
 *
 * arguments represents the data values supplied to the function when it is called,
 * which are used by the function, and return type is the data type of
 *the value that the function will return as result.
 * **/
fun main(){
    println("The square of 9 is : ${getSquare(9)}")
}


fun getSquare(number: Int): Int {
    return number * number
}

/**
 * Few important points regarding functions are:
 *
 * Once we have defined a function, we can call it as many times as we want.
If while calling the function, we provide wrong data type argument,
then we will get a compile time exception.
We can also define functions which do not return anything,
which we will cover in the next section.
 *
 * **/

   //Kotlin Functions that do not return anything

  /**
   * We can define functions which do return anything in Kotlin.
   * There are three different ways of doing so.
   *
   * 1-Kotlin Function with no return type:
   * 2-Kotlin Function with Unit return type:
   * 3-Kotlin Function with Nothing return type:
   *
   * **/

  //1-Kotlin Function with no return type

  fun sayHello(){
      println("Hello World!!")
  }

/**
 * In the above function, we can add parameters(arguments) if we want,
 * and still the function may not return anything. For example,
 * we can update the getSquare() function that we defined above,
 * to just print the result rather than returning it
 * **/

fun getSquareWithArguments(number: Int) {
    println("Square is: ${number * number}")
}

//2-Kotlin Function with Unit return type
 /**
  * If we wants to specify the return type, we can add Unit as the return type for
  * the functions which do not return anything meaningful.
  * It is similar to void in Java. If any return type is not mentioned
  * and any value is not returned from the function then by default return type is
  * considered as Unit.
  * **/

 fun sayHelloWithUnitReturnType(): Unit{
     println("Hello World!!")
 }

//3-Kotlin Function with Nothing return type
/**
 * In Kotlin, Nothing is a special type and it can also be used as
 * the return type for the user defined functions, for the functions which returns nothing.
 * Or, we can say, the function with Nothing as return type, never returns anything,
 * not even the default Unit type.
 * **/

fun exceptionEveryTime(): Nothing {
    throw IllegalArgumentException()
}

/**
 * NOTE: If we call the above function in our code,
 * then the code statement after this function call will not be
 * executed and the compiler will show a warning
 * **/

/**
 * In this tutorial we discussed about Kotlin user defined functions.
 * We saw why should we use functions and how to create user defined functions using the fun keyword.
 * We learned about defining new functions with different return types.
 * We also covered how to define function which do not return anything
 * using the Unit and Nothing type.
 * **/


