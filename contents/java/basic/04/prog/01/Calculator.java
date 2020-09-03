import java.io.*;

public class Calculator {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("１つめの値を入力してください。");
    String str1 = br.readLine();
    int num1 = Integer.parseInt(str1);

    System.out.println("２つめの値を入力してください。");
    String str2 = br.readLine();
    int num2 = Integer.parseInt(str2);

    System.out.println("計算方法を指定してください。\n１：足し算　２：引き算　３：掛け算　４：割り算");
    String str3 = br.readLine();
    int num3 = Integer.parseInt(str3);

    int ans;

    switch (num3){
      case 1:
        ans = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + ans);
        break;

      case 2:
        ans = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + ans);
        break;

      case 3:
        ans = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + ans);
        break;

      case 4:
        ans = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + ans);
        break;
    }
  }
}
