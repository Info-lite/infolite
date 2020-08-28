import java.io.*;

public class prob_5{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("xの値を入力してください。");
    String str = br.readLine();
    int x = Integer.parseInt(str);

    int ans = 0;

    if (x < 1) {
      System.out.println("xの値が1未満です。");
    } else {
      for (int i = 1; i <= x; i++){
        ans = ans + i;
      }
      System.out.println("結果 " + ans);
    }
  }
}
