fun main() {

}

// Kotlin에서 if문은 표현식으로 value를 return 한다.
fun max(a: Int, b: Int): Int {
  return if (a > b) {
    a
  } else {
    b
  }
}

// = 를 사용하여 반환타입을 생략할 수 있다.
fun min(a: Int, b: Int) = if (a < b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
  for (i in 1..num) {
    if (useNewLine) {
      println(str)
    } else {
      print(str)
    }
  }
}