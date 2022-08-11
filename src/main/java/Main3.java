public class Main3 {
  public static void main(String[] args) {

  }

  private void validateScoreIsNotNegative(int score) {
    if (score < 0) {
      throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
    }
  }

  private String getPassOrFail(int score) {
    if (score >= 50) {
      return "P";
    } else {
      return "F";
    }
  }

  private String getGradeWithSwitch(int score) {
    switch (score / 10) {
      case 9:
        return "A";
      case 8:
        return "B";
      case 7:
        return "C";
      default:
        return "D";
    }
  }
}
