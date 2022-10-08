package lec10;

public interface Javaflyable {
  default void act() {
    System.out.println("파닥 파닥");
  }
}
