

package collectionTypes.map

fun main() {

  val Ispace = hashMapOf(
      "Authorization" to "your-api-key",
      "ContentType" to "application/json",
      "UserLocale" to "Ghana"
  )

  Ispace.forEach {
          key, value ->
      println("Value for key $key is $value") } // printing formatted keys and values
  println(Ispace) // printing a map as an object

    Ispace["Authorization"] = "something else"
  println(Ispace)
}



