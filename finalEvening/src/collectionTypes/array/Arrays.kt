

package collectionTypes.array

fun main() {

  // simple initialization
  val arrayOfNumbers = arrayOf(2, 3, 5, 6, 10)
  val intArray = intArrayOf(2, 3, 5, 10)

  val someArray = emptyArray<String>() // same as arrayOf<String>()
  val someOtherArray = Array(5) { "" } // allocation with size and initializer



  println("The array size is: ${someArray.size}")
  println("The other array size is: ${someOtherArray.size}")

  // the difference in array types
  println(arrayOfNumbers)
  println(intArray)

  // accessing values


arrayOfNumbers.forEach { regina ->
  println("These are the regina values $regina")
}



  // printing each value -> iterating
  arrayOfNumbers.forEach {
    println(it)
  }
  intArray.forEach {
    println(it)
  }




  // indexed iteration
  arrayOfNumbers.forEachIndexed { index, value ->
    println("Value at index $index is $value")
  }

  // iterating using for loops
  for (number in arrayOfNumbers) {
    println("For loop $number")

  }

  for (number in intArray) {
    println(number)
  }



  // using indices
  val thirdValue = arrayOfNumbers[3] // same as arrayOfNumbers.get(2)
  println("The third value is $thirdValue")
   arrayOfNumbers[3] = 100 // we can reassign the values
  println("The third value is $thirdValue")
 println("The third value is ${arrayOfNumbers[3]}")
  // helpful functions
  println("The last value is: ${arrayOfNumbers.last()} and the first is: ${arrayOfNumbers.first()}")

  val names = arrayOf("Filip", "Babic", "Kotlin")

  printValues(" First", "Second", "Third", "Fourth",*names)
  //printValues( *names ) // spread operator

    mixedArrays()
    secondNum()
}




fun printValues(vararg mawuli: String) {
 mawuli.forEach {
    println(it)
  }
}



fun secondNum(){
    val nam = listOf("A","B","C")
    val nam1 = listOf("5","4","9",*nam.toTypedArray())

    for (naumber  in nam1){
        println("This for loop $naumber")
    }
}


fun mixedArrays(){
    val newNames = arrayOf("Mawuli","Koffi","Delali")
    val newNames1 = arrayOf("Java","Kotlin","PHP",*newNames)

    newNames1.forEach {
        values ->
        println(values)
    }
}