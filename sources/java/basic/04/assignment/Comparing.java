import java.io.*;

public class Comparing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("１つめの値を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        System.out.println("２つめの値を入力してください。");
        String str2 = br.readLine();
        int b = Integer.parseInt(str2);

        if (a == b) System.out.println("２つの数は等しいです。");
        else if (a > b) System.out.println(a + "のほうが大きいです。");
        else System.out.println(b + "のほうが大きいです。");
    }
}
