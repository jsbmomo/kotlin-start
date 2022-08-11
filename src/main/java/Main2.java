
public class Main2 {
  public static void main(String[] args) {
    JavaMoney mon1 = new JavaMoney(1_000L);
    JavaMoney mon2 = new JavaMoney(2_000L);

    if (mon1.compareTo(mon2) > 0) {
      System.out.println("mon1이 mon2보다 금액이 큽니다.");
    }
  }
}


