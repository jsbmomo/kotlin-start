import java.util.Arrays;
import java.util.List;

public class Main4 {
  public static void main(String[] args) {
    List<Long> numbers = Arrays.asList(1L, 2L, 3L);

    for (Long number : numbers) {
      System.out.println(number);
    }


    for (int i = 0; i <= 3; i++) {
      System.out.println(i);
    }

    for (int i = 3; i >= 0; i--) {
      System.out.println(i);
    }

    for (int i = 0; i < 5; i+=2) {
      System.out.println(i);
    }
  }
}
