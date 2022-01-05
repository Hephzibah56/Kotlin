package kotlinClassis

fun main(){
    val person2 = Person1("joe", 25)
}
/**
 * The primary constructor has a constrained syntax, and cannot contain any code.
 * To put the initialization code (not only code to initialize properties),
 * initializer block is used. It is prefixed with init keyword.
 * Let's modify the above example with initializer block:
 *
 * **/


class Person1(fName: String, personAge: Int) {
    val firstName: String
    var age: Int


    // initializer block
    init {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}

/**
 *
 * Here, parameters fName and personAge inside the parenthesis accepts
 * values "Joe" and 25 respectively when person2 object is created.
 * However, fName and personAge are used without using var or val,
 * and are not properties of the Person class.
 * The Person class has two properties firstName, and age are declared.
 *
 *
 *      When person1 object is created, code inside initializer block is executed.
 *    The initializer block not only initializes its properties but also prints them.
 *
 *
 *    To distinguish the constructor parameter and property,
 *    different names are used (fName and firstName, and personAge and age).
 *    It's more common to use _firstName and _age instead of completely different name for constructor parameters.
 *
 *    For example:
 *
 * **/
class Person3(_firstName: String, _age: Int) {
    val firstName = _firstName.capitalize()
    var age = _age

    // initializer block
    init {

    }
}



