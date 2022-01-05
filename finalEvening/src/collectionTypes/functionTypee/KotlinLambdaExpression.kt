package collectionTypes.functionTypee

/**
 * In this tutorial we will discuss about Lambda expressions in Kotlin.
 * Lambda functions or expressions are not new in Kotlin and exists in
 * many other languages like Python, Java and Javascript.
The Lambda function is similar to an anonymous function.
An Anonymous function is a function which does not have a name.
Basically, Lambda expression is a way to create functions concisely and pass them as argument,
return them, etc. We can call them as we call simple functions.
A Lambda expression can be treated as a variable.
It means, we can pass it as arguments to functions, return it from functions etc
 * **/



/**
 * In lambdas:

Arguments are mentioned on the left side of ->. The -> can be eliminated
if no argument is present on the left (we will see in Example 1).
Body of lambda is present after -> and it cannot be empty.
The last expression of lambda is considered as the return statement (see Example 2).
If no value is returned or return type is not mentioned,
Unit type will be considered as return type,
Lambda functions are called using the invoke() method or by just adding ()
after lambda name (with arguments).
 * **/
fun main() {

    // Calling lambda function using ()
    lambda()
    // Calling lambda function using invoke() function
    lambda.invoke()

    println("Area of rectangle of dimension 4 and 5 is: ${area(4,5)}")


    // Long way
    array.forEach {
            num ->
        println(num * num)
    }
// Shorthand
    array.forEach { println(it*it) }


}

// lambda expression with no argument
val lambda = { println("Lambdas are awesome!")}

val area = {
        length: Int,
        breadth: Int -> length*breadth
}

//it in Kotlin Lambda Expression

/**
 * If there is only one argument present in lambda expression
 * then it can be replaced with the it keyword.
 * It is a shorthand used in Kotlin and very useful.
 * The it keyword will represent the single argument passed to the lambda function.
 * **/

//Let us create an array and print squares of the elements in it using forEach loop
val array = arrayOf(10,2,3)

