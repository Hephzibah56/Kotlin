package kotlinClassis

// primary constructor are declared within the class header.

class Circle(i: Int) {

    init {

    }
}


//class Circle {
//
//    constructor(i: Int) {
//
//    }
//}



//Initializer block

class Square(val side: Int) {
    init {
        println(side * 2)
    }
}


class Circle1(val radius:Double) {
    constructor(name:String) : this(1.0)
    constructor(diameter:Int) : this(diameter / 2.0) {
        println("in diameter constructor")
    }
    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}


class Person2(var name: String)
fun main() {
    val person2 = Person2("Alex")
    println(person2.name) //Access with .<property name>
            person2.name //= "Joey" Set with .<property name>
            println(person2.name)
}

