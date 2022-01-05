package kotlinClassis

fun main(){

    val person1 = Person("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}
/**
 *  we have two types of constructor in kotlin
 *    1-primary constructor
 *    2-secondary constructor
 *      A constructor is a concise way to initialize class properties.
 *      It is a special member function that is called when an object is instantiated (created).
 *      However, how they work in Kotlin is slightly different
 *
 *      In Kotlin, there are two constructors:
 *
 *      1-Primary constructor - concise way to initialize a class
 *      2-Secondary constructor - allows you to put additional initialization logic
 *
 *                  Primary Constructor
 *          The primary constructor is part of the class header.
 *                 Here's an example:
 * **/

                class Person(val firstName: String, var age: Int) {
                    // class body


                }
   /**
    * The block of code surrounded by parentheses is the primary constructor:
    *                    (val firstName: String, var age: Int).
    * The constructor declared two properties: firstName (read-only property as it's declared using keyword val)
    * and age (read-write property as it is declared with keyword var).
    *
    * When the object of Person class is created, "Joe" and 25 values are passed as if Person is a function.
    * This initializes firstName and age properties of person1 object to "Joe" and 25 respectively.
    *
    *
    * **/

