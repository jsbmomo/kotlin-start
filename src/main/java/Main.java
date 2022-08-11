public class Main {
  public static void main(String[] args) {
    int num1 = 4;
    long num2 = num1;
    System.out.println(num1 + num2); // 8

    Person person = new Person("Jeon", 20);
    String log = String.format("사람의 이름은 %s이고, 나이는 %s세 입니다.", person.getName(), person.getAge());

    StringBuilder builder = new StringBuilder();
    builder.append("사람의 이름은 ");
    builder.append(person.getName());
    builder.append("이고, 나이는 ");
    builder.append(person.getAge());
    builder.append("세 입니다.");
  }

  // null 체크 후, exception 발생시킨다.
  public boolean startWithA1(String str) {
    if (str == null) {
      throw new IllegalStateException("Null!!!");
    }
    return str.startsWith("A");
  }

  // null를 그대로 반환한다.
  public Boolean startWithA2(String str) {
    if (str == null) {
      return null;
    }
    return str.startsWith("A");
  }

  // null 이 들어올 경우는 결국 A가 없으므로 false를 반환한다.
  public boolean startWithA3(String str) {
    if (str == null) {
      return false;
    }
    return str.startsWith("A");
  }

  public long calculate(Long num) {
    if (num == null) {
      return 0;
    }

    return 1;
    //
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getName());
    }
  }

}
