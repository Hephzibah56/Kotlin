package kotlinClassis

fun main(args: Array<String>) {

    val p1 = AuthLog2("Bad Password")
}

open class Log1 {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog2: Log1 {
    constructor(_data: String): this("From AuthLog -> $_data", 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}