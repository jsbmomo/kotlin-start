fun main() {
  val mon1 = JavaMoney(1_000L)
  val mon2 = JavaMoney(1_000L)

  // Kotlin 은 객체 비교 시, 비교 연산자를 사용하면 자동으로 compareTo 사용
  if (mon1 > mon2) {
    println("mon1이 mon2보다 금액이 큽니다.")
  }

  println(mon1)
  println(mon2)

  if (mon1 == mon1) {
    println("동등성")
  }

  if (mon1 === mon1) {
    println("등일성")
  }
}