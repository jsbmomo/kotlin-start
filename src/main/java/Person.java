import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;
  private final int age;

  public Person(String name, int age) {
    if (age <= 0) {
      throw new IllegalArgumentException(String.format("나이는 %d일 수 없습니다.", age));
    }
    this.name = name;
    this.age = age;
  }

  @Nullable
  public String getName() {
    return name;
  }

  public int getAge() { return age; }
}
