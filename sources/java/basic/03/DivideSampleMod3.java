import java.io.*;

public class DivideSampleMod3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("１つめの値を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        System.out.println("２つめの値を入力してください。");
        String str2 = br.readLine();
        int b = Integer.parseInt(str2);

        double ans = (double) a / b;

        System.out.println(a + "わる" + b + "は" + ans);
    }
}
