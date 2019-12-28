public class Solution {
    
  public int coinChange(int[] coins, int amount) {
    int max = amount + 1;
    int[] field = new int[amount + 1];
    Arrays.fill(field, max);
      
    field[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int j = 0; j < coins.length; j++) {
        if (coins[j] <= i) {
          field[i] = Math.min(field[i], field[i - coins[j]] + 1);
        }
      }
    }
      
    return field[amount] > amount ? -1 : field[amount];
  }
}