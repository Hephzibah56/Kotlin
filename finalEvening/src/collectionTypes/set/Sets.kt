

package collectionTypes.set


data class Worker(
    val id: Int,
    val name: String
)


fun main() {
  val workers = setOf(
      Worker(id = 5, name = "Filip"),
      Worker(id = 3, name = "Mike"),
      Worker(id = 5, name = "Filip"),
      Worker(id = 4, name = "Filip")
  )

  // hashcode is used to remove duplicates
  println(workers)
}