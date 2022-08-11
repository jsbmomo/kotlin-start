import org.jetbrains.annotations.NotNull;

// 주어진게 작으면 양수, 같으면 0
class JavaMoney implements Comparable<JavaMoney> {
  private final long amount;

  public JavaMoney(long amount) {
    this.amount = amount;
  }

  @Override
  public int compareTo(@NotNull JavaMoney o) {
    return Long.compare(this.amount, o.amount);
  }
}