
fun main() {

  val num1: Int? = 4
  val num2: Long = num1?.toLong() ?: 0L

  println(num2)
  println(printAgeIfPersonNull(null))

  val person = Person("Jeon", 25)
  val log = "사람의 이름은 ${person.name}이고, 나이는 ${person.age}세 입니다."
  println(log)

  val name = "Jeon"
  """
    HI!
    Nice to see you.
    My name is ${name}.
  """.trimIndent()

  println(name[0])
}

fun printAgeIfPerson(obj: Any) {
  if (obj !is Person) {
    println(obj)
  }
}

fun printAgeIfPersonNull(obj: Any?) {
  val person = obj as? Person
  println(person?.name)
}
