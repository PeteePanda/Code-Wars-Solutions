public class Multiple3And5 {

  public int solution(int number) {
    int total = 0;
    for (int i = 0; i < number; i++) {
      if (i % 3 == 0) {
        total += i;
      }
      else if (i % 5 == 0) {
        total += i;
      }
    }
    return(total);
  }
}