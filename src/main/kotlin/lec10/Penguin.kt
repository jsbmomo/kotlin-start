package lec10

class Penguin (
  species: String,
) : Animal(species, 2) {

  private val wingCount: Int = 2

  override fun move() {
    println("펭귄이 움직임...")
  }

  override val legCount: Int
    get() = super.legCount + this.wingCount

}