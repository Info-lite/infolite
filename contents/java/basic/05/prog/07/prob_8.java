import java.io.*;

public class prob_8{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("nの値を入力してください。");
    String str1 = br.readLine();
    int n = Integer.parseInt(str1);

    System.out.println("mの値を入力してください。");
    String str2 = br.readLine();
    int m = Integer.parseInt(str2);

    int a = 1;
    int b = 1;
    int c = 1;

    for (int i = 1; i <= n; i++){
      a = a * i;
    }
    for (int i = 1; i <= m; i++){
      b = b * i;
    }
    for (int i = 1; i <= n - m; i++){
      c = c * i;
    }
    System.out.println((a / (b * c)) + "通り");
  }
}
