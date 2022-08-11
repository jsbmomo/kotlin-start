import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Main5 {
  public static void main(String[] args) throws IOException {
    String str = "test";
    String value = String.format("%s is %s", str, str);
    System.out.println(value);

    JavaFilePrinterWith5 printer = new JavaFilePrinterWith5();
    printer.readFile();
  }

  private int parseIntOrThrow(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.", str));
    }
  }

}
