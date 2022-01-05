package kotlinClassis

 class iSpace {
    val turboNetForKotlin: Boolean = false
    val users:String = "Ispace"


   fun techTeam(){
        var firstHostName ="Mr Godwin"
        var secondHostName = "Mss Peace"

       println("Tech team member:$firstHostName")
       println("Tech team member:$secondHostName")
    }

    fun socialMedia(){

    }

    fun receptionispace(){

    }
}

fun main(){
    val ispaceTechTeam = iSpace()
    ispaceTechTeam.techTeam()

    val aa = FistClass()

   // val bb = secondClass(12)
   // println(bb.x)


    val cc = thirdClass(42)
      println(cc.y)

    val box1 = Box(100, 20, 40)
    val box2 = Box(length = 100)
    val box3 = Box(length = 100, width = 20, height = 40)


    val s = Square(10)

    val c = Circle1("AP")

}