package collectionTypes.function

fun main(){

    val array = intArrayOf(345,4567,678)
    val max = getMax(5,6,7,*array,9,78,90,890)

}

fun getMax(vararg numbers: Int):Int{
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}