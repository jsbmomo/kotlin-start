
fun main () {
  val person = Person1("Jeon", 100)
  println(person.name)
  person.age = 10
  println(person.age)
}


// kotlin의 생성자
// kotlin에서는 field만 만들면 getter와 setter를 자동으로 만들어준다.
// kotlin에서는 default가 public
class Person1(val name:String = "Seung", var age: Int) {
  init { // init은 클래스가 초기화(생성)되는 시점에 한 번 호출되는 블록
    if (age <= 0) {
      throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
    }
  }

  constructor(name: String): this(name, 1) // 부생성자 (추가적인 생성자)

  constructor(): this("Beom", 100) {
    println("기본 사용자 생성")
  }

  // 함수 생성
  fun isAdult(): Boolean {
    return this.age >= 20
  }

  // 프로퍼티로 생성
  val isAdult2: Boolean
    get() = this.age >= 20
//    get() {
//      return this.age >= 20
//    }
}