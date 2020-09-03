import java.io.*;

public class Triangle{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("三角形の底辺と高さの値を入力してください。");
    String str1 = br.readLine();
    int num1 = Integer.parseInt(str1);

    String str2 = br.readLine();
    int num2 = Integer.parseInt(str2);

    double ans = (double) num1 * num2 / 2;

    System.out.println("三角形の面積は、" + ans + "です。");
  }
}
