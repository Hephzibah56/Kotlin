package collectionTypes.function



fun main(){
  //  printPower(4,6)
   // sumUp(10)
    listOfNumbers()
    addNumbers()

}

val list = listOf(3,5,8)
fun printFirstElement(list: List<Int>) = println(list[1])

fun multiply(a:Int,b:Int) = a.times(b)

fun printPower(base: Int,exponent: Int){
    var result = 1
    for (i in 1..exponent){
        //this means we want to multiply that result exponent time
        result *= base
        println("$base to the power of $exponent is $result")
    }
    println("$base to the power of $exponent is $result")
}

/**
 * write a program to calculate the values from 1 to 5 is 15
 * your function should take highest number as argument
 * and then calculate the sum from 1 to that number n
 * **/

fun sumUp(n:Int){
    var result = 0
    for (i in 1..n){
        result += i
    }
    println("The sum of the values from 1 to $n is $result")
}

 fun listOfNumbers(){
     val list = listOf(2,3,5,6,7,8)
     println("The list looks like the following: $list")

//      list.forEach {
//          Regina -> println("For each Regina $Regina")
//      }


      val input = readLine()?.toInt()
       if (input != null){
           println("The index of $input is ${indexOf(list,input)}")
       }
 }

fun indexOf(list: List<Int>, input: Int):Int {
    for (i in 0 until list.size){
        if (list[i] == input){
            return i
        }
    }
    return -1
}

/**
 *
 * 1- given val list = listOf(2,3,4,5,6,7,8,9)
print the list to the console and ask a user to input one number from the list
write a function to receive the list of numbers and print the index of the input number by the user
if the entered number not found.it returns -1


2-write a program to sum up the values from 1 to 5
 *
 *
 * given val list = listOf(2,3,4,5,6,7,8,9)
 * print the list to the console and ask a user to input one number from the list
 * write a function to receive the list of numbers and print the index of the input number by the user
 * if the entered number not found.it returns -1
 * **/
var result = 0
fun addNumbers(){

    val listFromOneToFive = listOf(1,2,3,4,5)
    listFromOneToFive.forEach {
        sumAll -> println("")
     result += sumAll

    }

    println(result)

    var result = 0
    for (numb in listFromOneToFive){

        result += numb

    }
    println("The sum from 1 to 5 is $result")
}




