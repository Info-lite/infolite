import java.io.*;

public class compare{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    System.out.println("１つめの値を入力してください。");
    String str1 = br.readLine();
    int num1 = Integer.parseInt(str1);

    System.out.println("２つめの値を入力してください。");
    String str2 = br.readLine();
    int num2 = Integer.parseInt(str2);

    if (num1 > num2) {
      System.out.println(num1 +"のほうが大きいです。");
    }else if (num1 < num2) {
      System.out.println(num2 +"のほうが大きいです。");
    }else if (num1 == num2) {
      System.out.println("２つの数は等しいです。");
    }
  }
}
