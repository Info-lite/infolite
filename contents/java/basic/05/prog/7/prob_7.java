import java.io.*;

public class prob_7{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("変数nの値を入力してください。");
    String str1 = br.readLine();
    int n = Integer.parseInt(str1);

    System.out.println("実行回数を入力してください。");
    String str2 = br.readLine();
    int m = Integer.parseInt(str2);

    if (n == 0){
      System.out.println("error");
    } else {
      for (int i = 1; i < m; i++){
        if (n % 2 == 0){
          n = n / 2;
        } else {
          n = n * 3 + 1;
        }
        System.out.println(n);
      }
    }
  }
}
