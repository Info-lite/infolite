import java.io.*;

public class Calc{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("１つめの値を入力してください。");
    String str1 = br.readLine();
    int num1 = Integer.parseInt(str1);

    System.out.println("２つめの値を入力してください。");
    String str2 = br.readLine();
    int num2 = Integer.parseInt(str2);

    double ans = (double) num1 / num2;

    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    System.out.println(num1 + " / " + num2 + " = " + ans);
  }
}
