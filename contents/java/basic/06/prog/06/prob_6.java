public class prob_6{
  public static void main(String[] args){
    int a[][] = { {1, 3}, {5, 11} };
    int b[][] = { {2, 6}, {8, 10} };
    int c[][] = new int[2][2];

    for (int i = 0; i < 2; i++){
      for (int j = 0; j < 2; j++){
        c[i][j] = a[i][j] + b[i][j];
        System.out.printf("%3d", c[i][j]);
      }
      System.out.println();
    }
  }
}
