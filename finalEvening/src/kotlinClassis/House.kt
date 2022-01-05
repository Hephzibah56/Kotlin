package kotlinClassis

fun main (){

}

class FistClass{

}

class secondClass(x: Int){

}

class thirdClass(val y: Int){

}

class Box(val length: Int, val width:Int = 20, val height:Int = 40)




open class Log {
    constructor(data: String) {
        // code
    }
    constructor(data: String, numberOfData: Int) {
        // code
    }
}

class AuthLog: Log {
    constructor(data: String): super(data) {
        // code
    }
    constructor(data: String, numberOfData: Int): super(data, numberOfData) {
        // code
    }
}
/**
 * In Kotlin, you can also call a constructor from another constructor
 * of the same class (like in Java) using this().
 * **/

class AuthLog1: Log {
    constructor(data: String): this(data, 10) {
        // code
    }
    constructor(data: String, numberOfData: Int): super(data, numberOfData) {
        // code
    }
}
