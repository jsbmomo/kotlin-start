import kotlin.IllegalArgumentException


fun main() {
  val str: String? = "abc"
//  str.length // 불가능
  str?.length // 가능

  val alphabet : String? = "ABCDE"
  alphabet?.length ?: 0

  println(alphabet?.length ?: 0)
}

// ? =  null 이 들어올 수 있음을 명시해야한다.
fun startWithA1(str: String?): Boolean {
  return str?.startsWith("A")
    ?: throw IllegalArgumentException("Null!!!")
}

fun startWithA2(str: String?): Boolean? {
  return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
  return str?.startsWith("A") ?: false
}

fun startWithA(str: String?): Boolean {
  return str!!.startsWith("A")
}

fun calculate(num: Long?): Long {
  num ?: return 0

  return 1
  //
}