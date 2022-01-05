package kotlinClassis

fun main(){
    val l1 = Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lamp class
    println( l1.turnOn())

   val lamp = Lamp()
    lamp.displayLightStatus()



    val myHouse = House()
    println(myHouse)

}



/**
 * In object-oriented style of programming,
 * you can divide a complex problem into smaller sets by creating objects.
 *
 * These objects share two characteristics
 *
 *    state and behavior
 *
 *    Let's take few examples:
 *
 *    Lamp is an object
      It can be in on or off state.
      You can turn on and turn off lamp (behavior).
      Bicycle is an object
      It has current gear, two wheels, number of gears etc. states.
      It has braking, accelerating, changing gears etc. behavior.

 *
 *                                Kotlin Class
 *     Before you create objects in Kotlin, you need to define a class.
 *     A class is a blueprint for the object.
 *
 *
 *     We can think of class as a sketch (prototype) of a house.
 *     It contains all the details about the floors, doors, windows etc.
 *     Based on these descriptions we build the house. House is the object.
 *
 *
 *     Since, many houses can be made from the same description,
 *     we can create many objects from a class.
 *
 *                 How to define a class in Kotlin?
 *        To define a class in Kotlin, class keyword is used:
 *
 *                            class ClassName {
                                 // property or properties
                                 // member function or functions
                                 ... .. ...
                               }



 * **/

                            class Lamp {

                                // property
                                private var isOn: Boolean = false

                                // member function
                                fun turnOn():String {
                                    isOn = true
                                   // println("Status:$isOn")
                                    return "Status:$isOn"
                                }

                                // member function
                                fun turnOff() {
                                    isOn = false
                                }

                                fun displayLightStatus() {
                                    if (isOn == true)
                                        println("lamp is on.")
                                    else
                                        println("lamp is off.")
                                }
                            }

                 /**
                  *
                  * Here, we defined a class named Lamp.
                  * The class has one property isOn (defined  as variable),
                  * and two member functions turnOn() and turnOff()
                  *
                  *
                  * Classes, objects, properties, member function etc.
                  * can have visibility modifiers. For example, the isOn property is private.
                  * This means, the isOn property can be changed from only inside the Lamp class.
                  *
                  *
                  * Other visibility modifiers are:private - visible (can be accessed) from inside the class only.
                  *   public - visible everywhere.
                  *   protected - visible to the class and its subclass.
                  *   internal - any client inside the module can access them.
                  *   If you do not specify the visibility modifier, it will be public by default.
                  *
                  *
                  *   Kotlin Objects
                  *
                  *   When class is defined, only the specification for the object is defined;
                  *   no memory or storage is allocated.
                  *   To access members defined within the class, you need to create objects.
                  *   Let's create objects of Lamp class.
                  *
                  *
                  *                    How to access members?
                  *  You can access properties and member functions of a class by using . notation. For instance,
                  *  l1.turnOn()
                  *
                  *
                  *
                  *
                  *
                  *                                     summary
                  *
                  *                                     In the above program,

                                                       Lamp class is created.
                                     The class has a property isOn and three member functions turnOn(),
                                     turnOff() and displayLightStatus().
                                     Two objects l1 and l2 of Lamp class are created in the main() function.
                                     Here, turnOn() function is called using l1 object: l1.turnOn().
                                     This method sets isOn instance variable of l1 object to true.
                                     And, turnOff() function is called using l2 object: l1.turnOff().

                                     This method sets isOff instance variable of l2 object to false.
                                     Then, displayLightStatus() function is called for l1 and l2 objects
                                     which prints appropriate message depending on whether isOn property is true or false.
                                     Notice that, the isOn property is initialized to false inside the class.
                                     When an object of the class is created, isOn property for the object is initialized to false automatically.
                                     So, it's not necessary for l2 object to call turnOff() to set isOn property to false.
                  * **/


                 class House {
                     val color: String = "white"
                     val numberOfWindows: Int = 2
                     val isForSale: Boolean = false

                     fun updateColor(newColor: String){

                     }

                 }