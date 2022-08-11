fun main() {
  val test: Person = Person("Jeon", 100)
  var b = 100

  val filePrinter = FilePrinter()
  filePrinter.readFile()
}

fun parseIntOrThrow(str: String): Int {
  try {
    return str.toInt();
  } catch (e: NumberFormatException) {
    throw IllegalArgumentException("${str}는 숫자가 아닙니다.")
  }
}

fun parseIntOrThrows(str: String): Int? {
  return try {
    str.toInt()
  } catch (e: NumberFormatException) {
    null
  }
}