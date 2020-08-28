import java.io.*;

public class prob_9 {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("値を3つ入力してください。");
    System.out.println("入力1>>");
    String str1 = br.readLine();
    int num1 = Integer.parseInt(str1);

    System.out.println("入力2>>");
    String str2 = br.readLine();
    int num2 = Integer.parseInt(str2);

    System.out.println("入力3>>");
    String str3 = br.readLine();
    int num3 = Integer.parseInt(str3);

    int tmp;

    if (num1 < num2) {
      tmp = num1;
      num1 = num2;
      num2 = tmp;
    }
    if (num2 < num3) {
      tmp = num2;
      num2 = num3;
      num3 = tmp;
    }
    if (num1 < num2) {
      tmp = num1;
      num1 = num2;
      num2 = tmp;
    }

    System.out.println("結果>> " + num1 + "," + num2 + "," + num3);
  }
}
