import java.io.*;

public class CalcSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("値を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        int sum = 0;
        for (int i = 1; i <= a; i++) sum += i;

        System.out.println("1から" + a + "までの和は、" + sum + "です。");
    }
}
