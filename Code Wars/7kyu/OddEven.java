public class OddEven {
  public static String oddOrEven (int[] array) {
    int total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }
    if (total % 2 == 0) {
      return("even");
    }
    else {
      return("odd");
    }
  }
}
