public class GreedIsGood{
  public static int greedy(int[] dice){
    int[] count = {0, 0, 0, 0, 0, 0};
    int score = 0;
    for (int i = 0; i < dice.length; i++) {
      count[dice[i]-1]++;
    }
    if (count[0] >= 3) {
      count[0] -= 3;
      score += 1000;
    }
    for (int i = 0; i < count.length; i++) {
      if (count[i] >= 3) {
        count[i] -= 3;
        score += (i+1)*100;
      }
    }
    while (count[0] > 0) {
      count[0] -= 1;
      score += 100;
    }
    while (count[4] > 0) {
      count[4] -= 1;
      score += 50;
    }
    return score;
  }
}
