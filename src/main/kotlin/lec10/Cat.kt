package lec10

class Cat(
  species: String
) : Animal(species, 4) {

  override fun move() {
    println("Cat moving...")
  }

}