import java.io.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("１つめの値を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        System.out.println("２つめの値を入力してください。");
        String str2 = br.readLine();
        int b = Integer.parseInt(str2);

        System.out.println("計算方法を指定してください。");
        System.out.println("１：足し算　２：引き算　３：掛け算　４：割り算");
        String str3 = br.readLine();
        int mode = Integer.parseInt(str3);

        if (mode == 1) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (mode == 2) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (mode == 3) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (mode == 4) {
            System.out.println(a + " / " + b + " = " + (a / b) + "あまり" + (a % b));
        } else {
            System.out.println("計算方法には1から4までの数字を入力してください。");
        }
    }
}
