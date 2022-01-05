package collectionTypes.functionTypee

/**
 *  we discussed about the Kotlin lambda functions.
 * In this section we will move one step ahead and discuss about higher order functions in Kotlin.
 It allows a function to be used as a variable. So,
  a function can be passed as an argument to another function,
   returned from a function, stored in a variable or data structure, etc.

A function which takes another function as an argument or returns
a function is known as a higher order function. Often lambda expressions are passed as
an argument to a higher order function or returned from i
 * **/


fun main() {
    //to pass a function as an argument we use :: operator.
    higherOrderFunction(::sayHello, "Ninja")

    //
    val functionName = higherOrderFunctionReturnValue()
    functionName("Ninja")



}




fun sayHello(name: String){
    println("In sayHello() function")
    println("Say hello to $name")
}

fun higherOrderFunction(functionName: (name: String)-> Unit, name: String){
    println("In higher order function")
    println("Calling sayHello() function...")
    functionName(name)
}


//Kotlin Function as a return value
fun sayHelloReturnValue(name: String){
    println("In sayHello() function")
    println("Say hello to $name")
}

fun higherOrderFunctionReturnValue(): (name:String) -> Unit{
    println("In higher order function")
    // return the sayHello function
    return ::sayHelloReturnValue
}

