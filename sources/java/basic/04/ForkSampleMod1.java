import java.io.*;

public class ForkSampleMod1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("数字を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        if (a == 1) {
            System.out.println("入力したのは１ですね。");
        } else {
            System.out.println("入力したのは１ではありません。");
        }
    }
}
