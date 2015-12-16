import java.io.*;

public class DivideSampleMod1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("１つめの値を入力してください。");
        String str1 = br.readLine();
        double a = Double.parseDouble(str1);

        System.out.println("２つめの値を入力してください。");
        String str2 = br.readLine();
        double b = Double.parseDouble(str2);

        double ans = a / b;

        System.out.println(a + "わる" + b + "は" + ans);
    }
}
