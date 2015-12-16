import java.io.*;

public class ForkSampleMod2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("数字を入力してください。");
        String str1 = br.readLine();
        int a = Integer.parseInt(str1);

        if (a == 1) {
            System.out.println("入力したのは１ですね。");
        } else if (a == 2) {
            System.out.println("入力したのは２ですね。");
        } else if (a == 3) {
            System.out.println("入力したのは３ですね。");
        } else {
            System.out.println("入力したのは１、２、３ではありません。");
        }
    }
}
