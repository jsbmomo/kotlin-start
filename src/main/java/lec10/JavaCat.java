package lec10;

public class JavaCat extends JavaAnimal {
  public JavaCat(String species) {
    super(species, 4);
  }

  @Override
  public void move() {
    System.out.println("Cat moving..");
  }
}
