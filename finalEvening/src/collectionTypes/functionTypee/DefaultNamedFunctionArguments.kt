package collectionTypes.functionTypee

/**
 * In this tutorial we will discuss about different types of arguments in Kotlin functions.
 * Arguments are the values which are passed to a function when the function is called.
 *
 *
 * In Kotlin, there are multiple types of arguments that can be used while declaring and calling a Kotlin user-defined function.
 *
 * They are:
 *  1-Positional arguments
    2-Default arguments
    3-Named arguments
 * **/



 fun main() {
     printInfo("Groot", 9)

     // Providing both the arguments
     //both the arguments are provided and these arguments are chosen over default arguments.
     printInfoWithDefaultArgument("Groot", 2)


     // Providing none of the arguments
     //none of the argument is provided. So, default arguments are used.
     printInfoWithDefaultArgument()

     // Providing only name
     //argument for name is provided but for age default argument is taken.
     printInfoWithDefaultArgument("Groot")

     //But in this case, if we try to pass only age we will get an error.
    // printInfoWithDefaultArgument(89)

 }
//1-Kotlin Positional Arguments

/**
 * These are the basic type of arguments present in any language.
 * These are position based arguments. The first argument corresponds to
 * the first parameter in function definition, second argument to second parameter and so on.
 * **/
 fun printInfo(name: String, age: Int) {
     println("Hi! My name is $name and I'm $age months old.")
 }

 /**
  * If we try reversing their position i.e. 2 first and "Groot" later,
  * it will not work with positional arguments
  * **/

//2-Kotlin Default Arguments
/**
 *Default arguments are used to provide default value to a function parameter.
 *  Consider a situation in which we want to assign a default value
 *  to function parameter if any value is not passed by the user while calling the function,
 * then the default value will be used
 **/

fun printInfoWithDefaultArgument(name: String = "XYZ", age: Int = 18) {
    println("Hi! My name is $name and I'm $age months old.")
}

/**
 * Here, we defined default value XYZ for name and 18 for age.
 * Let us call this function using different number of arguments:
 * **/


//3-Kotlin Named Argument
/**
 * While calling the function, we can specify that a particular argument is meant
 * for a particular parameter using the name of the parameter.
 * These types of arguments are known as Named arguments.
 * **/

fun printInfoWithNamedArgument(name: String = "XYZ", age: Int = 18) {
    println("Hi! My name is $name and I'm $age months old.")
}

/**
 * Using named argument, we can also rearrange the arguments.
 * We just need to give the name of the parameter and use
 * name = value format while calling the function.
 * **/

fun printInfo(name: String, gender: String, Nationality: String) {
    println("Hi! My name is $name")
    println("My gender is $gender")
    println("I'm from $Nationality")
}








