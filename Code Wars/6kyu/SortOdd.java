public class SortOdd {
  public static int[] sortArray(int[] array) {
    int min;
    int max;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 1) {
        for (int j = i; j < array.length; j++) {
          min = array[i];
          max = array[j];
          if (max % 2 == 1 && max < min) {
            array[i] = max;
            array[j] = min;
          }
        }
      }
    }
    return array;
  }
}