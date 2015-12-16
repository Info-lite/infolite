import java.io.*;

public class CalcPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("値を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        int i;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + "は素数ではありません。");
                break;
            }
        }

        if (a == i) System.out.println(a + "は素数です。");
    }
}
